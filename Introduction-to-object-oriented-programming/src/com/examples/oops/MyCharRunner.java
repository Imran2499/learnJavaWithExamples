package com.examples.oops;

public class MyCharRunner {
	public static void main(String[] args) {
		
		MyChar mychar = new MyChar('B');
		System.out.println(mychar.isVowel());
		System.out.println(mychar.isDigit());
		System.out.println(mychar.isAlphabet());
		System.out.println(mychar.isConsonants());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
