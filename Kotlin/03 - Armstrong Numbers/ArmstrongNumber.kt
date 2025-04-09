object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val digits = input.toString().map { it.toString().toInt() }
        val power = digits.size
        val sum = digits.sumOf { Math.pow(it.toDouble(), power.toDouble()).toInt() }
        return sum == input
    }
}
