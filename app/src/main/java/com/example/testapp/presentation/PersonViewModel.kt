package com.example.testapp.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapp.data.PersonDbModel
import com.example.testapp.data.PersonRepositoryImpl
import com.example.testapp.domain.AddPersonUseCase
import kotlinx.coroutines.launch

class PersonViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = PersonRepositoryImpl(application)
    private val getAddPerson = AddPersonUseCase(repository)

    fun getAddPerson(namePerson : String, surnamePerson : String, agePerson : String) {
        val age = parseAge(agePerson)
        viewModelScope.launch {
            val personDbModel = PersonDbModel(0, namePerson, surnamePerson, age)
            getAddPerson.getAddPerson(personDbModel)
        }
    }

    private fun parseAge(inputCount: String?) : Int {
        return try {
            inputCount?.trim()?.toInt() ?: 0
        } catch (ex : Exception) {
            0
        }
    }
}