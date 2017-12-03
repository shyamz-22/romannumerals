package com.ennovate.kata.romannumerals


class RomanNumerals {

    private val basicRomanNumerals = mapOf(
            1 to "I",
            5 to "V",
            10 to "X",
            50 to "L",
            100 to "C",
            500 to "D",
            1000 to "M",
            4 to "IV",
            9 to "IX",
            40 to "XL",
            90 to "XC",
            400 to "CD",
            900 to "CM"
    )

    fun convert(decimal: Int): String {
        val range = rangeOf(decimal) ?: return "can't handle '$decimal'"
        val romanNumeralBuilder = mutableListOf<String>()

        romanNumeralBuilder.add(basicRomanNumerals[range]!!)

        when {
            (decimal > range) -> { romanNumeralBuilder.add(convert(decimal - range)) }
            (decimal < range) -> { (0 until decimal).forEach { romanNumeralBuilder.add(basicRomanNumerals[range]!!) } }
        }

        return romanNumeralBuilder.joinToString("")
    }

    private fun rangeOf(digit: Int): Int? {
        return when {
            (digit in 1..3) -> 1
            (digit == 4) -> 4
            (digit in 5..8) -> 5
            (digit == 9) -> 9
            (digit in 10..39) -> 10
            (digit in 40..49) -> 40
            (digit in 50..89) -> 50
            (digit in 90..99) -> 90
            (digit in 100..399) -> 100
            (digit in 400..499) -> 400
            (digit in 500..899) -> 500
            (digit in 900..999) -> 900
            (digit in 1000..3999) -> 1000
            else -> null
        }
    }
}