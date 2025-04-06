package com.examples.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artofcp = new Book();
		Book effectiveJava = new Book();
		Book cleancode = new Book();

		artofcp.suggestBooks();
		effectiveJava.suggestBooks();
		cleancode.suggestBooks();

		artofcp.noOfCopies = 10;
		effectiveJava.noOfCopies = 05;
		cleancode.noOfCopies = 02;
	}

}
