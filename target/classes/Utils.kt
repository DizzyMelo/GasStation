class Utils {
    companion object {
        fun askForInput(message: String) : String {
            print("$message: ".uppercase())
            return readLine()?:""
        }
        fun listPaymentMethods() {
            var counter = 1
            for (method in PaymentType.values()) {
                println("$counter - ${method.description}")
                counter += 1
            }
        }
    }
}