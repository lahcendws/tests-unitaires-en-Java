package fr.unittesting.unittest.unittest;

import fr.wildcodeschool.unittesting.StringUtils;

public class Application {

    public static void main(String[] args) {
    	StringUtils objString = new StringUtils();
    	String myString = objString.uniqueVowels("exemple");
    	System.out.println(myString);
    }

}