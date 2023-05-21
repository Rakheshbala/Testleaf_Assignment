package week2.day3;

public class RemoveDuplicate {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String txt = "We learn java basics as part of java java sessions in java week1";
				int count = 0;
				String[] split = txt.split(" ");
				for (int i = 0; i < split.length; i++) {
					for (int j = i+1; j < split.length; j++) {
						if(split[i].equals(split[j])) {
							count = count + 1;
							if(count>0) {
								split[j]="";
							}
						}
					}
					
				}
					String result = "";
					for (int i = 0; i < split.length; i++) {
						String a = split[i];
						if(a.length() > 0) {
							result = result+split[i]+" ";
						}
					}
				System.out.println(result);
		}
		}

	

	
