package app.mkv.quizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTow: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)
