package com.salvamr.mockito

import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

@Singleton
class TestClass @Inject constructor(private val testOperator: TestOperator) {
    fun getRandomValue(): Int = testOperator.generatePositiveRandomNumber()
}

@Singleton
class TestOperator @Inject constructor() {
    fun generatePositiveRandomNumber(): Int = Random.nextInt()
}