package com.seankang.project

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class QuestionTest {

    val user = User(1, "Larry")

    @Test
    fun `should throw exception if the title is empty `() {
        Assertions.assertThrows(QuestionException::class.java) {
            Question( 1, user, "", "question")

        }

    }
}