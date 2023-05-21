package week2.day2;

public class StringNameBala {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String name="Bala";
		int length=name.length();
		System.out.println(length);
		//output:t,e,
		char[] forwardArray= name.toCharArray();
		for(int i=0;i<forwardArray.length;i++) {
		System.out.println(forwardArray[i]+"  ");
			
		}
		
		
	}

}
