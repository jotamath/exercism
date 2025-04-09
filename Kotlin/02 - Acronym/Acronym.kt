object Acronym {
    fun generate(phrase: String) : String {
        return phrase.split(Regex("[^A-Za-z']+"))
        .map { it.first().uppercase() }
            .joinToString("")
    }
}
