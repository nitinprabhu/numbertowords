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
		assertNumberToWordsConversion(200, "three hundred");
	}

	private void assertNumberToWordsConversion(final int number, final String expectedWords)
	{
		assertEquals(expectedWords, NumberToWordsConverter.convert(number));
	}

}
