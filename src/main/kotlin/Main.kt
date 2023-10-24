fun main(args: Array<String>) {
    startGame()
}

fun requestNumberInput(value: String): Double {
    var requestedValue:Double? = null;

    while (requestedValue == null){
        print("Enter value for $value: ")
        val numberString = readlnOrNull()

        if (numberString.isNullOrBlank() || numberString.toDoubleOrNull() == null) {
            println("Invalid Number, please enter a valid number.");
        } else {
            requestedValue = numberString.toDouble();
        }
    }

    return requestedValue;
}

fun playAgainOrNot(): Boolean {
    var requestedValue:Boolean? = null;

    while (requestedValue == null){
        print("Do you want to play again? Y for yes, N for no:");
        val userAnswer = readlnOrNull();

        if (userAnswer.isNullOrBlank()) {
            println("Invalid answer.");
        } else if (userAnswer == "Y" || userAnswer == "N") {
            requestedValue = userAnswer == "Y"
        } else {
            println("Please enter Y for Yes, or N for no.");
        }
    }

    return requestedValue;
}

fun startGame(){
    var playGame:Boolean = true;
    println("Welcome to math! :)")

    while (playGame){
        val x = requestNumberInput("X");
        val y = requestNumberInput("Y");

        val z = x + y;
        println("$x + $y = $z");

        playGame = playAgainOrNot()
    }

    println("Thank you for playing! :)")
}