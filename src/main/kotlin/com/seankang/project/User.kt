package com.seankang.project

class User (val id: Int, val name: String) {
    var reputation: Int = 0
        private set

    fun changeReputation(amount: Int) {
        reputation += amount
    }

    fun questionOrAnswerVotedOn(direction: VoteEnum) {
        when (direction) {
            VoteEnum.Up -> reputation++
            VoteEnum.Down -> reputation--
        }
    }

    fun canEditPost(): Boolean {
        return reputation > 2000
    }
    fun canComment(): Boolean {
        return reputation > 50
    }

    fun canVote(): Boolean {
        return reputation > 15
    }
}