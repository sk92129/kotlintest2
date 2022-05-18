package com.seankang.project

import com.seankang.project.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
//import org.junit.jupiter.params.ParameterizedTest


class CalculatorTests {

    @Test
    fun `1 + 1 = 2`() {
        val calculator = Calculator()
        assertEquals (2, calculator.add(1, 1), "1 + 1 should equal 2")
    }
/*
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(
        "0, 1, 1",
        "1, 2, 3",
        "49, 51, 100",
        "1, 100, 101"
    )*/

}