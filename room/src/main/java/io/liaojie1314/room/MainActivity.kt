package io.liaojie1314.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.liaojie1314.room.databinding.ActivityMainBinding
import io.liaojie1314.room.db.UserDatabase
import io.liaojie1314.room.entity.UserEntity
import kotlin.concurrent.thread

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private val userDao by lazy {
        UserDatabase.getInstance(this).getUserDao()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.apply {
            //添加数据
            btnAdd.setOnClickListener{
                thread {
                    userDao.addUser(UserEntity(name = "张三", age = 28))
                }
            }
            //查询所有数据
            btnQueryAll.setOnClickListener{
                thread {
                    val userList = userDao.queryUser()
                    userList.forEach{
                        Log.d(TAG, "查询出来的数据:$it")
                    }
                }
            }
            //修改数据
            btnUpdate.setOnClickListener {
                thread {
                    userDao.updateUser(UserEntity(3,"李四",18))
                }
            }
            //删除数据
            btnDelete.setOnClickListener {
                thread {
                    userDao.deleteUser(UserEntity(2,"张三",28))
                }
            }
        }
    }
}