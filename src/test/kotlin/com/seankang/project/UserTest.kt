package com.seankang.project

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UserTest {
    val user = User(1, "Alice")

    @Test
    fun shouldBeAbleToIncreaseReputation() {
        user.changeReputation(10)

        Assertions.assertEquals(10, user.reputation)
    }

    @Test
    fun shouldBeAbleToDecreaseReputation() {
        user.changeReputation(10)
        user.changeReputation(-5)
        // you might think that user.reputation is 15
        // but that is wrong
        // in junit5, each test will re-create the Test instance so that the user
        // is created again
        Assertions.assertEquals(5, user.reputation)
    }
}