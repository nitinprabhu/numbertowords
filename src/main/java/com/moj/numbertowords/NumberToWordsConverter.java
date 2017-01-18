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
									"nine"};

	public static String convert(final int number)
	{
		return NUMBERS[number];
	}

}
