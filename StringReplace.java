package week3.day1;


public class StringReplace {
	
	public void replace(String sentence) {
		 System.out.println(sentence.replace("8", "11") + "#");
		}
		
public void print(String sentence) {
		System.out.println(sentence.substring(5, 15));
	}

	public static void main(String[] args) {
		StringReplace str = new StringReplace();
		str.replace( "I am working with Java8");
		str.print("I am working with Java8");
		
	}

}
