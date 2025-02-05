package com.string.Basic1;

public class AcharacterIPrest {

	public static void main(String[] args) {

		String s = "hello world";
		char ch = 'f';

		for (int i = 0; i < s.length(); i++) {
			char ch2 = s.charAt(i);
			if (ch == ch2) {
				System.out.println("Element is present");
			}
		}

	}

}
