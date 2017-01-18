package com.moj.numbertowords;

public class NumberToWordsConverter
{
	private static final String[] NUMBERS = {
									"zero",
									"one",
									"two",
									"three",
									"four",
									"five",
									"six",
									"seven",
									"eight",
									"nine",
									"ten",
									"eleven",
									"twelve",
									"thirteen",
									"fourteen",
									"fifteen",
									"sixteen",
									"seventeen",
									"eighteen",
									"nineteen"};

	public static String convert(final int number)
	{
		return NUMBERS[number];
	}

}
