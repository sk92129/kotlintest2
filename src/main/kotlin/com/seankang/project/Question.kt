package com.seankang.project

class Question (id: Int, author: User, var title: String, question: String) :
    QuestionOrAnswer(id, author, question ){

    init {
        if (!isValid())
            throw QuestionException("Question either has no title or body")
    }

    private fun isValid () : Boolean {
        return ! (title.isNullOrBlank()  || body.isNullOrBlank())
    }

    var answered = false
        private set

    var closed = false
        private set

    var closedReason = ""
        private set

    private val _answers = mutableListOf<Answer>()
    val answers : List<Answer>
        get() {
            return _answers.toList()
        }

    private val _tags = mutableListOf<Tag>()
    val tags: List<Tag>
        get() {
            return _tags.toList()
        }



    override fun vote (direction: VoteEnum) {
       if (!closed){
           throw QuestionException("question has been deactivaeted")
       }
        when (direction ){
            VoteEnum.Up -> votes++
            VoteEnum.Down -> votes--
        }
        author.questionOrAnswerVotedOn(direction)
    }
}