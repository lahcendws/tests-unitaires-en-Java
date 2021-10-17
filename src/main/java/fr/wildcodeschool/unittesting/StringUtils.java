package fr.wildcodeschool.unittesting;

public class StringUtils {
	private static final String ALL_VOWELS = "aeiouyAEIOUY";

	public static String vowels(String candidate) {
		String vowels = "";
		char[] letters = candidate.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			if (ALL_VOWELS.indexOf(letters[i]) >0) {
				vowels=vowels+ letters[i];
				
			} 
		}
		return vowels;
	}

	public static String uniqueVowels(String str) {
		// Create an empty string
		String vowels = "";
		String voels2 = "";
		char[] letters = str.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			if (ALL_VOWELS.indexOf(letters[i]) > 0) {
				vowels = vowels + letters[i];
			}

		}
		char[] letters2 = vowels.toCharArray();
		for (int j = 0; j < letters2.length; j++) {
			if (!voels2.contains(String.valueOf(vowels.charAt(j)))) {
				voels2 += String.valueOf(vowels.charAt(j));
			}
		}
		return voels2;
	}
}
