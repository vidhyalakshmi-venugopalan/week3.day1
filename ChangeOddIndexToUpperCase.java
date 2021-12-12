package week3.day1;

public class ChangeOddIndexToUpperCase {
	
	public void changeOddIndex(String test) {
		for (int i =0; i< test.length(); i++) {
if (i%2 ==1) {
	char a = test.charAt(i);
	String s = String.valueOf(a);
	System.out.print(s.toUpperCase());
}
	}
		
	}

	public static void main(String[] args) {
		ChangeOddIndexToUpperCase convert = new ChangeOddIndexToUpperCase();
		convert.changeOddIndex("changeme");

	}

}
