package io.liaojie1314.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.liaojie1314.room.entity.StudentEntity

@Dao
interface StudentDao {
    @Insert
    fun insertStudent(vararg studentEntity: StudentEntity)

    @Query("select * from student")
    fun queryAllStudent():List<StudentEntity>

    @Delete
    fun deleteStudent(vararg studentEntity: StudentEntity)
}