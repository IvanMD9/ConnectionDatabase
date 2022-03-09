package com.example.testapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person_items")
data class PersonDbModel(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val surname : String,
    val age : Int
)
