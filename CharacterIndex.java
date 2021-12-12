package week3.day1;

public class CharacterIndex {
	public void findCharacter(String str) {
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("s"));

	}

	public static void main(String[] args) {
		CharacterIndex ch = new CharacterIndex();
		ch.findCharacter ("Java Exercise");

	}

}
