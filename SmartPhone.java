package week3.day1;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsapp() {
		System.out.println("Send message from whatsapp to Preethi");
	}
	public void takeVideo() {
		System.out.println("Take video from SmartPhone");

	}
	public static void main(String[] args) {
		SmartPhone smt = new SmartPhone();
		smt.takeVideo();
	}
}
