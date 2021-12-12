package week3.day1;

import java.util.Arrays;

public class Anagram {
	public void anagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			System.out.println("The lengths of the given strings are same");
			char[] ch1 =str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)){
			System.out.println("The given strings are anagram");
		}
		}
	
	}
public static void main(String[] args) {
		Anagram angm = new Anagram();
		angm.anagram("stops", "potss");
	}

}
