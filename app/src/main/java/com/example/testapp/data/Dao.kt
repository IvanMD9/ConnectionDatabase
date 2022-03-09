package com.example.testapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Dao {

    @Query("SELECT * FROM person_items")
    fun getAllPerson() : LiveData<List<PersonDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPerson(personDbModel: PersonDbModel)
}