package bank;

public class BankInfo {
	public void saving() {
		System.out.println("A/C Balance:500000");
	}
	public void fixed() {
		System.out.println("Fixed Rate of Interest :7.5%");
	}
	public void deposit() {
		System.out.println("Deposit Amount:250000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo details=new BankInfo();
		details.saving();
		details.fixed();
		details.deposit();

	}

}
