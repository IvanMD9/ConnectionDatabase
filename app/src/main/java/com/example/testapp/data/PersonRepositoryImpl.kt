package com.example.testapp.data

import android.app.Application
import com.example.testapp.domain.PersonRepository

class PersonRepositoryImpl(application: Application) : PersonRepository {

    private val personDao = AppDatabase.getInstance(application).getPersonDao()

    override suspend fun addPerson(personDbModel: PersonDbModel) {
        personDao.addPerson(personDbModel)
    }
}