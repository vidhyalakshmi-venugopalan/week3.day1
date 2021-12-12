package week3.day1;

public class FindTypes {

	int letter = 0, space = 0, num = 0, specialChar = 0;

	public void find(String test) {

		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			char charAt = ch[i];

			if (Character.isLetter(charAt)) {
				letter = letter + 1;
			}

			else if (Character.isDigit(charAt)) {
				num = num + 1;
			}

			else if (Character.isSpaceChar(charAt)) {
				space = space + 1;
			}

			else {

				specialChar = specialChar + 1;
			}
		}

		System.out.println("letter " + letter);
		System.out.println("number " + num);
		System.out.println("space character " + space);
		System.out.println("special character " + specialChar);

	}

	public static void main(String[] args) {
		FindTypes findty = new FindTypes();
		findty.find("$$ Welcome to 2nd Class of Automation $$");
	}

}
