package com.moj.numbertowords.test;

import org.junit.Test;
import static org.junit.Assert.*;

import com.moj.numbertowords.NumberToWordsConverter;

public class NumberToWordsCoverterTest
{

	@Test
	public void convertsZero()
	{
		assertEquals("zero", NumberToWordsConverter.convert(0));
	}

	@Test
	public void convertsSingleDigits()
	{
		assertNumberToWordsConversion(1, "one");
		assertNumberToWordsConversion(2, "two");
		assertNumberToWordsConversion(3, "three");
		assertNumberToWordsConversion(4, "four");
		assertNumberToWordsConversion(5, "five");
		assertNumberToWordsConversion(6, "six");
		assertNumberToWordsConversion(7, "seven");
		assertNumberToWordsConversion(8, "eight");
		assertNumberToWordsConversion(9, "nine");
	}

	@Test
	public void convertsTenToNineteen()
	{
		assertNumberToWordsConversion(10, "ten");
		assertNumberToWordsConversion(11, "eleven");
		assertNumberToWordsConversion(12, "twelve");
		assertNumberToWordsConversion(13, "thirteen");
		assertNumberToWordsConversion(14, "fourteen");
		assertNumberToWordsConversion(15, "fifteen");
		assertNumberToWordsConversion(16, "sixteen");
		assertNumberToWordsConversion(17, "seventeen");
		assertNumberToWordsConversion(18, "eighteen");
		assertNumberToWordsConversion(19, "nineteen");
	}

	@Test
	public void convertsMultiplesOfTenUpToNinety()
	{
		assertNumberToWordsConversion(20, "twenty");
		assertNumberToWordsConversion(30, "thirty");
		assertNumberToWordsConversion(40, "forty");
		assertNumberToWordsConversion(50, "fifty");
		assertNumberToWordsConversion(60, "sixty");
		assertNumberToWordsConversion(70, "seventy");
		assertNumberToWordsConversion(80, "eighty");
		assertNumberToWordsConversion(90, "ninety");
	}

	@Test
	public void convertsArbitraryTwoDigitNumbers()
	{
		assertNumberToWordsConversion(36, "thirty-six");
		assertNumberToWordsConversion(79, "seventy-nine");
	}

	@Test
	public void convertsHundreds()
	{
		assertNumberToWordsConversion(100, "one hundred");
		assertNumberToWordsConversion(200, "two hundred");
	}

	@Test
	public void convertsArbitraryThreeDigitNumbers()
	{
		assertNumberToWordsConversion(243, "two hundred and forty-three");
		assertNumberToWordsConversion(360, "three hundred and sixty");
		assertNumberToWordsConversion(405, "four hundred and five");
	}

	@Test
	public void convertsThousands()
	{
		assertNumberToWordsConversion(4000, "four thousand");
		assertNumberToWordsConversion(9000, "nine thousand");
	}

	@Test
	public void convertsArbitraryFourDigitNumbers()
	{
		expectConversion(1234, "one thousand two hundred and thirty-four");
		expectConversion(9600, "nine thousand six hundred");
		expectConversion(2050, "two thousand and fifty");
		expectConversion(7008, "seven thousand and eight");
	}

	@Test
	public void convertsArbitraryFiveAndSixDigitNumbers()
	{
		expectConversion(123456, "one hundred and twenty-three thousand four hundred and fifty-six");
		expectConversion(200003, "two hundred thousand and three");
		expectConversion(340000, "three hundred and forty thousand");
		expectConversion(400500, "four hundred thousand five hundred");
		expectConversion(600070, "six hundred thousand and seventy");
		expectConversion(800000, "eight hundred thousand");
		expectConversion(90000, "ninety thousand");
		expectConversion(10020, "ten thousand and twenty");
		expectConversion(12300, "twelve thousand three hundred");
	}

	@Test
	public void convertsArbitrarySevenEightAndNineDigitNumbers()
	{
		expectConversion(123456789, "one hundred and twenty-three million four hundred and fifty-six thousand seven hundred and eighty-nine");
		expectConversion(100000002, "one hundred million and two");
		expectConversion(345000067, "three hundred and forty-five million and sixty-seven");
		expectConversion(12300400, "twelve million three hundred thousand four hundred");
		expectConversion(7000000, "seven million");
	}

	@Test(expected = IllegalArgumentException.class)
	public void rejectsNumbersOver999999999()
	{
		NumberToWordsConverter.convert(1000000000);
	}

	private void expectConversion(final int number, final String expectedWords)
	{
		assertEquals(expectedWords, NumberToWordsConverter.convert(number));
	}

	private void assertNumberToWordsConversion(final int number, final String expectedWords)
	{
		assertEquals(expectedWords, NumberToWordsConverter.convert(number));
	}

}
