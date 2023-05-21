package week2.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a= "stops";
			String b = "potss";
			int len1 = a.length();
			int len2 = b.length();
			if(len1==len2) {
				char[] charArray1 =a.toCharArray();
				char[] charArray2 =b.toCharArray();
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);
				boolean Equal = Arrays.equals(charArray1, charArray2);
				if (Equal) 
				{
					System.out.println("It is an anagram word");

				} else
				{
					System.out.println("It isn't an anagaram word");
				}
			}


	}

}
