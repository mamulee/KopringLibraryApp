package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
}

class CalculatorTest {

    fun addTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

//        val expectedCalculator = Calculator(8)
//        if(calculator != expectedCalculator) {
//            throw IllegalStateException()
//        }

        // then
        if(calculator.number != 8) {
            throw IllegalStateException()
        }
    }
}