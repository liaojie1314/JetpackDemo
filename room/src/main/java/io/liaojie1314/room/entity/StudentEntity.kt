package io.liaojie1314.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class StudentEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 1,
    @ColumnInfo(name = "studentName")
    var studentName: String,
    @ColumnInfo(name = "studentNo")
    var studentNo: String
)