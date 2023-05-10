package week1.day3;

public class Cycle {
	String brandName="BTW";
	char logo='B';
	long plateNumber=98745l;
	int noOfTyre=2;
	boolean damage=false;
	
	public void pressHorn() {
		System.out.println("pressHorn");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle features=new Cycle();
		features.pressHorn();
		System.out.println("Brand name : "+features.brandName);
		System.out.println(features.logo);
	}

}
