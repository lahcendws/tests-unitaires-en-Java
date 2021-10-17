package fr.unittesting.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.wildcodeschool.unittesting.StringUtils;

public class StringUtilsTest {

	@Test
	public void testStringUtils() {
		assertEquals("e", StringUtils.uniqueVowels("exemple"));	
		
	}
	@Test
	public void testStringUtilsWithoutVowels() {
		assertEquals("", StringUtils.uniqueVowels("fdrs"));	
		
	}
	@Test
	public void testStringUtilsExeception() {
		assertEquals("", StringUtils.uniqueVowels(""));	
		
	}

}
