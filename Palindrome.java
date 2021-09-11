package Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Madam";
		char[] rev = new char[text.length()];
		char[] charArray = text.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			rev[i] = charArray[i];
		}
		String reveredstring = String.valueOf(rev);
		if (text.equals(reveredstring) || text.equalsIgnoreCase(reveredstring)) {
			System.out.print("String " + text + " is a palindrome");
		} else
			System.out.print("String " + text + " not a palindrome");

	}

}
