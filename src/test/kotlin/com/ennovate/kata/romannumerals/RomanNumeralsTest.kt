package com.ennovate.kata.romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RomanNumeralsTest {

    @Test
    fun `prints basic decimals as roman numerals`() {
        assertThat(RomanNumerals().convert(1)).isEqualTo("I")
        assertThat(RomanNumerals().convert(5)).isEqualTo("V")
        assertThat(RomanNumerals().convert(10)).isEqualTo("X")
        assertThat(RomanNumerals().convert(50)).isEqualTo("L")
    }

    @Test
    fun `prints with addition rules`() {
        assertThat(RomanNumerals().convert(2)).isEqualTo("II")
        assertThat(RomanNumerals().convert(3)).isEqualTo("III")
    }

    @Test
    fun `prints complex decimals as roman numerals`() {
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
}


