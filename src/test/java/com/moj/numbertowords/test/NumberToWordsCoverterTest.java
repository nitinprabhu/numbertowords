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

	private void assertNumberToWordsConversion(final int number, final String expectedWords)
	{
		assertEquals(expectedWords, NumberToWordsConverter.convert(number));
	}

}
