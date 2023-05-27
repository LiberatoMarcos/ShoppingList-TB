package com.example.shoppinglist.DATA

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface TaskDao {

    //create
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(task: Task)

    @Query("Select * from task")
    fun getAll(): List<Task>

    //update
    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(task: Task)

    //deleta todos
    @Query("DELETE from task")
    fun deleteAll()

    //delete from id
    @Query("DELETE from task WHERE id =:id")
        fun deleteById(id: Int)

}