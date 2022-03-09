package com.example.testapp.domain

import com.example.testapp.data.PersonDbModel

interface PersonRepository {

    suspend fun addPerson(personDbModel: PersonDbModel)
}