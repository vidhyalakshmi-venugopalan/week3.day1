package week3.day1;

public class Calculator {
	public void add(int num1, int num2) {
	System.out.println(num1+num2);	
        
	}
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);	
	        
		}
	public void mul(int num1, int num2) {
		
     System.out.println(num1*num2);
	}
	public void mul(int num1, double num2) {
		System.out.println(num1*num2);
    
	}
	 public void sub(int num1, int num2) {
		 System.out.println(num1-num2);
		 
	}
	 public void sub(double num1, double num2) {
		 System.out.println(num1-num2);	
		 
		}
	
     public void div(int num1, int num2) {
    	 System.out.println(num1/num2);	
     }	 
     public void div(double num1, int num2) {
    	 System.out.println(num1/num2);		
     }
     
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.add(10, 20, 30);
		cal.mul(10, 10);
		cal.mul(10, 10.5);
		cal.sub(20, 10);
		cal.sub(10.55, 5.5);
		cal.div(100, 10);
		cal.div(10.50, 2);
	}
	

}
