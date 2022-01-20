fun main(args: Array<String>) {
    var menu = CustomMenu()
    menu.generateMenu("welcome to maverik")

    print("PRESS ENTER TO CONTINUE: ")
    readLine()

    menu.gasOptionsMenu()

    var gas: Gas? = null

    while (gas == null) {
        val op = Utils.askForInput("choose gas option")
        var optionId = -1
        if (op.isNotEmpty()) {
            optionId = op.toInt()
        }
        gas = menu.validateGasOption(optionId)
    }

    print("HOW MUCH GAS YOU WANT (IN DOLLARS) $: ")
    var amount = readLine()!!.toDouble()

    print("PRESS ENTER TO START FUELING: ")
    readLine()

    var total = 0.0
    var amountInGallons = amount / gas.price

    while (total < amountInGallons) {
        Thread.sleep(Metrics.PUMPER_SPEED.toLong())
        total += Metrics.AMOUNT_SPEED_RATIO
        println(String.format("%.2f", ( total)) + " gal" + " - $" + String.format("%.2f", (gas.price * total)))
    }
}