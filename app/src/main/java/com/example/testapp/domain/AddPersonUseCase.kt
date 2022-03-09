package com.example.testapp.domain

import com.example.testapp.data.PersonDbModel

class AddPersonUseCase(private val repository: PersonRepository) {

    suspend fun getAddPerson(personDbModel: PersonDbModel) {
        repository.addPerson(personDbModel)
    }
}