package fr.wildcodeschool.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringUtils {

	@Test
	public void testVowels() {
		StringUtils vowel = new StringUtils();
		String word = "alfa";
		String stringVowel = vowel.vowels(word);
		assertEquals(stringVowel,"aa");
	}
	@Test
	public void testVowels2() {
		StringUtils vowel = new StringUtils();
		String word = "1223";
		String stringVowel = vowel.vowels(word);
		assertEquals(stringVowel,"");
	}

}
