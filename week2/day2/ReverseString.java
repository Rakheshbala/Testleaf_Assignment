package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Bala";
		char[] revArray= name.toCharArray();
		for(int i=revArray.length-1;i>=0;i--) {
		System.out.println(revArray[i]+"  ");
		}
	}

}
