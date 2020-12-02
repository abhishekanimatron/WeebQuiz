package com.example.quizzy

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "Which anime's character is this?",
            R.drawable.ic_alice,
            optionOne = "Great Pretender",
            optionTwo = "Devilman: Crybaby",
            "Sword Art Online: Alicization",
            optionFour = "Vinland Saga",
            correctAnswer = 3
        )
        questionsList.add(que1)
        val que2 = Question(
            2,
            "Which anime's character is this?",
            R.drawable.ic_deku,
            optionOne = "Fairy Tail",
            optionTwo = "Boku no hero Academia",
            "Boku no Pico",
            optionFour = "Dr. Stone",
            correctAnswer = 2
        )
        questionsList.add(que2)
        val que3 = Question(
            3,
            "Which anime's character is this?",
            R.drawable.ic_hisoka,
            optionOne = "Yamishibai",
            optionTwo = "Seven Deadly Sins",
            "Boruto: Naruto Next Generations",
            optionFour = "Hunter X Hunter",
            correctAnswer = 4
        )
        questionsList.add(que3)
        val que4 = Question(
            4,
            "Which anime's character is this?",
            R.drawable.ic_rem,
            optionOne = "Kono Subarashii",
            optionTwo = "Re:Zero Starting Life in Another World",
            "Kaguya-sama: Love is War",
            optionFour = "Fairy Gone",
            correctAnswer = 2
        )
        questionsList.add(que4)
        val que5 = Question(
            5,
            "Which anime's character is this?",
            R.drawable.ic_ryuk,
            optionOne = "Bleach",
            optionTwo = "One Piece",
            "Death Note",
            optionFour = "Detective Conan",
            correctAnswer = 3
        )
        questionsList.add(que5)

        return questionsList
    }
}