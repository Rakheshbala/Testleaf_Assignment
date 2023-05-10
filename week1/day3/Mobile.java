package week1.day3;

public class Mobile {
	public void onFlash() {
		System.out.println("onFlash");
	}
	
	int price=5000;
	
public static void main(String[]args) {
	
	Mobile mobile=new Mobile();
	mobile.onFlash();
	System.out.println(mobile.price);

}
}