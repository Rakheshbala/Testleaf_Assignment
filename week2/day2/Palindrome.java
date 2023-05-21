package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="madam";
		String b = "";
		//shortcut a.toCharArray() ctrl+2 L
		char[] revArray= a.toCharArray();
		for(int i=revArray.length-1;i>=0;i--) {
                  b=b+revArray[i];
		}
		System.out.println(b);
			if(a.equals(b)) {
				System.out.println("it is palindrome");
			}
			else
			{
					System.out.println("it is not plaindrome");
			}
		
			}
	}


