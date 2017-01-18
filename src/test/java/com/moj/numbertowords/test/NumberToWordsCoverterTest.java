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
}
