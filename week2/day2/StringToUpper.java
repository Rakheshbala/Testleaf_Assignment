package week2.day2;

public class StringToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upper case
		String text="test";
		String upperCase=text.toUpperCase();
		System.out.println(upperCase);
		
		//lower case 
		String text1="LEAF";
		String lowerCase=text1.toLowerCase();
		System.out.println(lowerCase);
		
		//small and upper case alternative
		String word="Changeme";
		char []charArray=word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0) {
				char upper=Character.toUpperCase(charArray[i]);
				System.out.print(upper);
			}
			else
			{
				System.out.print(charArray[i]);
			}
			}
		}
			
		}
			
	


