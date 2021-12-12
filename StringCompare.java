package week3.day1;

public class StringCompare {
	String s1 = "I am Learning Java";
	String s2 = "I am learning java";
public void compare() {
	if (s1==s2 ) {
		System.out.println("Compare - The Strings are equal");
		}
	else 
		System.out.println("Compare - The Strings are not equal");
}

public void equal() {
	if (s1.equals(s2)){
		System.out.println("Equal - The Strings are equal");
		}
	else 
		System.out.println("Equal - The Strings are not equal");
}
public void equalsIgnore() {
	if (s1.equalsIgnoreCase(s2)){
		System.out.println("EqualsIgnore - The Strings are equal");
		}
	else 
		System.out.println("EqualsIgnore - The Strings are not equal");
}

	public static void main(String[] args) {
		StringCompare comp = new StringCompare();
		comp.compare();
		comp.equal();
		comp.equalsIgnore();
		
	}

}
