package week1.day4;

public class CalculatorAssignment {
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println("Addition       : "+c);
	}
	public void subtractionTwoNumber(int e,int f) {
		int g=e-f;
		System.out.println("Subtraction    : "+g);
	}
	public void multiplicationTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println("Multiplication : "+k);
	}
	public void divisionTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println("Division       : "+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorAssignment problem=new CalculatorAssignment();
		problem.additionTwoNumber(5, 5);
		problem.subtractionTwoNumber(110, 10);
		problem.multiplicationTwoNumber(100, 10);
		problem.divisionTwoNumber(1000000, 100);
		

	}

}
