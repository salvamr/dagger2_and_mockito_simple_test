package com.salvamr.mockito

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import javax.inject.Inject

@RunWith(MockitoJUnitRunner::class)
class TestClassTest {

    @Mock
    private lateinit var testClass: TestClass

    private val ASSERTION_NUMBER = 1337

    @Test
    fun addition_isCorrect() {
        // When getRandomValue gets called anywhere in this scope return ASSERTION_NUMBER
        whenever(testClass.getRandomValue()).doReturn(ASSERTION_NUMBER)

        val x = testClass.getRandomValue()

        assert(x == ASSERTION_NUMBER)
    }
}
