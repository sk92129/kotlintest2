package com.seankang.project

interface IUnderflowService {
    fun addQuestion(userId: Int, questionId: Int)
    fun addAnswer(userId: Int, answerId: Int)
    fun voteUpQuestion(questionId: Int, voterId: Int) : Int
    fun voteDownQuestion(questionId: Int, voterId: Int): Int
}

interface IUserService {
    fun createUser(): User
    fun addBadge(userId: Int, badgeId: Int): Unit

}

class UserflowService () {
}