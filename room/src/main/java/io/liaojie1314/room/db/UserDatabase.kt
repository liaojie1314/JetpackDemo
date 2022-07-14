package io.liaojie1314.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.liaojie1314.room.dao.UserDao
import io.liaojie1314.room.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

    companion object {
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
                    ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}