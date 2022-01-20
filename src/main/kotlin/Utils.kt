class Utils {
    companion object {
        fun askForInput(message: String) : String {
            print("$message: ".uppercase())
            return readLine()?:""
        }
    }
}