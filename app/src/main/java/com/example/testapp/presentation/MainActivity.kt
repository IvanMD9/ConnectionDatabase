package com.example.testapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : PersonViewModel

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[PersonViewModel::class.java]
        addPerson()
    }

    private fun addPerson() = with(binding) {
        btnSave.setOnClickListener {
            viewModel.getAddPerson(etName.text.toString(), etSurname.text.toString(), etAge.text.toString())
        }
    }
}