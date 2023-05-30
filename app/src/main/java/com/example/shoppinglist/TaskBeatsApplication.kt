package com.example.shoppinglist

import android.app.Application
import androidx.room.Room
import com.example.shoppinglist.DATA.AppDataBase

class TaskBeatsApplication: Application() {

    lateinit var dataBase : AppDataBase

    override fun onCreate() {
        super.onCreate()

        dataBase = Room.databaseBuilder(
            applicationContext,
            AppDataBase::class.java, "taskbeats-database"
        ).build()
    }

    fun getAppDataBase(): AppDataBase {
        return dataBase
    }
}