package week2.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
	      String[] split = test.split(" ");
	      for(int i =0;i<split.length;i++) {
	    	  if(i%2!=0) {
	    		 // System.out.println();
	    		 char[] arr1 = split[i].toCharArray();
	    		 for(int j=arr1.length-1;j>=0;j--) {
	    			 System.out.print(arr1[j]+ "");
	    		 }
	    		System.out.print(" ");
	    	  }
	    	 // System.out.println();
	    	  else {
	    		 // System.out.print(" ");
	    		  System.out.print(split[i]+ " ");
	    	  }
	      }
	}
}


