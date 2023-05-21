package week2.day2;

public class BooleanEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val1="testleaf";
		String val2="testleaf";
		
		//different method1
		boolean equals= val1.equals(val2);
		System.out.println(equals);
		
		//different method2
		if(val1==val2) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
	}

}
