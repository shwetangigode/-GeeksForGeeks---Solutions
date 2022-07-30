package com.practice;

public class MergeStrings {
	// The below method will merge strings alternatively
	String merge(String S1, String S2) {
		// to store the characters
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < S1.length() || i < S2.length(); i++) {
			if (i < S1.length()) {
				sb.append(S1.charAt(i));
			}
			if (i < S2.length()) {
				sb.append(S2.charAt(i));
			}
		} // for
		return sb.toString();
	}//merge()

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Bye";
		String output = new MergeStrings().merge(s1, s2);
		System.out.println(output);
	}//main()
}// class
