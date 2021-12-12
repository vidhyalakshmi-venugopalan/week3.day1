package week3.day1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("Student id is " + id);
	}
	
	public void getStudentInfo(String name) {
		System.out.println("Student name is " + name);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id and name are " + id + " " + name);
	}
	
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student email and phoneNumber are " + email + " " + phoneNumber);
	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.getStudentInfo(1025);
		stud.getStudentInfo("Preethi");
		stud.getStudentInfo(1050, "Vidhya");
		stud.getStudentInfo("preethivid.46@gmail.com", "9677292564");
		}
}
