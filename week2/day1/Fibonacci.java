package week2.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int sum=0,a=0,b=1;
		for(int i=0;i<=8;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			
			}
		}
	}

