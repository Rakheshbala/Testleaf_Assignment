package bank;

public class Students {

		public void getStudentInfo(int ID,String name) {
			System.out.println("ID :" + ID +"  Name:" + name);
		}

		public void getStudentInfo(String email,long PhoneNo) {
			System.out.println("E-mail id:" + email + "    Phone number :"+ PhoneNo);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Students details = new Students();
			details.getStudentInfo(5, "Rakesh");
			details.getStudentInfo("abc@gmail.com", 987654321l);

		}

	}

