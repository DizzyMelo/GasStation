import java.lang.Exception

open class CustomMenu {
    fun generateMenu(message: String) {
        println("");
        println("=======================================================")
        println("=======================================================")
        println(formatMenuMessage(message))
        println("=======================================================")
        println("=======================================================")
        println("")
    }

    fun gasOptionsMenu() {
        println("GAS OPTIONS")

        for (option in Gas.gasOptions) {
            println("${option.id} - ${option.name}: $${option.price}".uppercase())
        }
    }

    fun validateGasOption(input: Int) : Gas? {
        return try {
            val choice = input
            Gas.gasOptions[choice - 1]
        } catch (e: Exception) {
            null
        }
    }

    private fun formatMenuMessage(message: String): String {
        var tempMessage = message
        while (tempMessage.length < 55) {
            tempMessage = " $tempMessage "
        }

        return tempMessage.uppercase()
    }
}