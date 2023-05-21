package week2.day2;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="i like chicken";
		String[] split=txt.split(" ");
		
		int length=split.length;
		System.out.println(length);
		
		int count=0;
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			//count=count+1;  or count++;
			count++;
		}
		System.out.println(count);

	}

}
