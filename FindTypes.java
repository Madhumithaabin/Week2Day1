package Assignments;

import Week2.CharecterOccurense;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				num++;
			} else if (Character.isLetter(charArray[i])) {
				letter++;
			} else if (Character.isSpace(charArray[i])) {
				space++;
			} else
				specialChar++;
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
