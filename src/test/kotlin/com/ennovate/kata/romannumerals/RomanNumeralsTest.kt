package com.ennovate.kata.romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RomanNumeralsTest {

    @Test
    fun `prints 1 as I`() {
        assertThat(RomanNumerals().convert(1)).isEqualTo("I")
    }

    @Test
    fun `prints II for 2`() {
        assertThat(RomanNumerals().convert(2)).isEqualTo("II")
    }

    @Test
    fun `prints III for 3`() {
        assertThat(RomanNumerals().convert(3)).isEqualTo("III")
    }

    @Test
    fun `prints IV for 4`() {
        assertThat(RomanNumerals().convert(4)).isEqualTo("IV")
    }

    @Test
    fun `prints V for 5`() {
        assertThat(RomanNumerals().convert(5)).isEqualTo("V")
    }

    @Test
    fun `prints VI for 6`() {
        assertThat(RomanNumerals().convert(6)).isEqualTo("VI")
        assertThat(RomanNumerals().convert(7)).isEqualTo("VII")
        assertThat(RomanNumerals().convert(8)).isEqualTo("VIII")
        assertThat(RomanNumerals().convert(9)).isEqualTo("IX")
        assertThat(RomanNumerals().convert(10)).isEqualTo("X")
        assertThat(RomanNumerals().convert(11)).isEqualTo("XI")
        assertThat(RomanNumerals().convert(12)).isEqualTo("XII")
        assertThat(RomanNumerals().convert(13)).isEqualTo("XIII")
        assertThat(RomanNumerals().convert(14)).isEqualTo("XIV")
        assertThat(RomanNumerals().convert(15)).isEqualTo("XV")
        assertThat(RomanNumerals().convert(16)).isEqualTo("XVI")
        assertThat(RomanNumerals().convert(17)).isEqualTo("XVII")
        assertThat(RomanNumerals().convert(18)).isEqualTo("XVIII")
        assertThat(RomanNumerals().convert(19)).isEqualTo("XIX")
        assertThat(RomanNumerals().convert(20)).isEqualTo("XX")
        assertThat(RomanNumerals().convert(31)).isEqualTo("XXXI")
        assertThat(RomanNumerals().convert(47)).isEqualTo("XLVII")
        assertThat(RomanNumerals().convert(59)).isEqualTo("LIX")
        assertThat(RomanNumerals().convert(123)).isEqualTo("CXXIII")
        assertThat(RomanNumerals().convert(1998)).isEqualTo("MCMXCVIII")
        assertThat(RomanNumerals().convert(2345)).isEqualTo("MMCCCXLV")
    }

    @Test
    fun timeTaken() {
        val romans = RomanNumerals()
        (0 until 3999).forEach{
           println("$it = ${romans.convert(it)}")
        }
    }
}


