package com.seankang.project

class Answer (id: Int, author: User, answer: String) : QuestionOrAnswer (id, author, answer) {

    init {
        if (!isValid())
            throw QuestionException("Answer either has no body")
    }

    private fun isValid() : Boolean {
        return true
    }

    override fun vote (direction: VoteEnum) {
        when (direction) {
            VoteEnum.Up -> votes++
            VoteEnum.Down -> votes--
        }
        author.questionOrAnswerVotedOn(direction)
    }

    var approved: Boolean = false
}