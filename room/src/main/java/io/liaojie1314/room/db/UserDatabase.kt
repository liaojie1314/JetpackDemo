package io.liaojie1314.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import io.liaojie1314.room.dao.StudentDao
import io.liaojie1314.room.dao.UserDao
import io.liaojie1314.room.entity.StudentEntity
import io.liaojie1314.room.entity.UserEntity

@Database(entities = [UserEntity::class,StudentEntity::class], version = 2)
abstract class UserDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

    abstract fun getStudentDao(): StudentDao

    companion object {
        private val MIGRATION_1_2 = object :Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(
                    """
                        create table student(
                        id integer primary key autoincrement not null,
                        studentName text not null,
                        studentNo text not null
                        )
                    """.trimIndent()
                )
            }
        }
        @Volatile
        private var INSTANCE: UserDatabase? = null
        @JvmStatic
        fun getInstance(context: Context): UserDatabase {
            val tmpInstance = INSTANCE
            if (tmpInstance != null) {
                return tmpInstance
            }
            //加锁
            synchronized(this) {
                val instance =
                    Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java,
                        "testDB"
                    )
                        .addMigrations(MIGRATION_1_2)
                        .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}