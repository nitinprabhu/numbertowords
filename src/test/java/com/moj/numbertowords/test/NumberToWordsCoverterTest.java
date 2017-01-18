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

	private void assertNumberToWordsConversion(final int number, final String expectedWords)
	{
		assertEquals(expectedWords, NumberToWordsConverter.convert(number));
	}

}
