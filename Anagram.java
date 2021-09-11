package Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length()) {
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			System.out.print("Arrays has same value :");
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == charArray2[i]) {
					System.out.print(charArray[i] + " ");
				} else {
					System.out.print("Two strings are not equal");
				}
			}
		}

	}

}
