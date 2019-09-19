package com.salvamr.mockito

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var testClass: TestClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateRandomNumber()

        btnChangeNumber.setOnClickListener {
            generateRandomNumber()
        }
    }

    private fun generateRandomNumber() {
        tvNumber.text = testClass.getRandomValue().toString()
    }
}
