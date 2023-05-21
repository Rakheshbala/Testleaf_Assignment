package week2.day2;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Input");
		String nextLine= scan.nextLine();
		
		char[] charArray=nextLine.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

	}

}
