package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Size : 16 inch");
	}

	public static void main(String[] args) {

		Desktop desktop=new Desktop();
	// parent class
		desktop.computerModel();
	// child class
		desktop.desktopSize(); 
		
		

	}

}
