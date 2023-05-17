package week2.day1;

import java.util.Arrays;

public class AscendingDescending {
public static void main(String[] args) {
	int[] num= {200,600,800,100,500};
	Arrays.sort(num);
	int a =10;
	System.out.println(a);
	System.out.println(num);
	
	for (int i=0;i< num.length;i++){
	System.out.println(num[i]);
	}
	for (int i = num.length-1;i>=0; i--) {
		System.out.println(num[i]);
		
	}
}
}
