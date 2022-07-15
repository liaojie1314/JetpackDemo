package io.liaojie1314.room.dao

import androidx.room.*
import io.liaojie1314.room.entity.UpdateNameBean
import io.liaojie1314.room.entity.UserEntity

@Dao
interface UserDao {
    //增加
    @Insert
    fun addUser(vararg userEntity: UserEntity)
    //删除
    @Delete
    fun deleteUser(vararg userEntity: UserEntity)
    //修改
    @Update
    fun updateUser(vararg userEntity: UserEntity)
    //查询
    @Query("select * from user")
    fun queryUser():List<UserEntity>

    @Update(entity = UserEntity::class)
    fun updateUser2(vararg updateNameBean: UpdateNameBean)
}