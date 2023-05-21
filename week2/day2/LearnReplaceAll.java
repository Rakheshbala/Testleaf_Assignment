package week2.day2;

public class LearnReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="bal200@gmail.com";
		String replaceAll=email.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
//alternative method
		String mail="rak06@gmail.com";
		String replaAll=mail.replaceAll("\\D","");
		System.out.println(replaAll);
		
//alternative method
		String email1="bal200@gmail.com";
		String replaceAll1=email1.replaceAll("[0-9]", "");
		System.out.println(replaceAll1);
		
//alternative method
		char[] charArray=email.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				System.out.println(charArray[i]);
			}
			
		}
//ascii value
		char[] charArray=email.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				System.out.println(charArray[i]);
			}
			
		}
//palindrome
		String a="Madam";
		for (int i = 0; i < charArray.length; i++) {
			
		}
		

	}

}
