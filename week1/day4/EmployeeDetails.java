package week1.day4;

public class EmployeeDetails {
	public void employeeName(String empName,int empId) {
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Id:"+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee address:"+empAddress);
	}
	public void employeeSalary(double empSalary) {
		System.out.println("Salary : "+empSalary);
	}
	public void employeeMobileNumber(long mobNum) {
		System.out.println("Mobile Number : "+mobNum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails details=new EmployeeDetails();
		details.employeeName("Rakhesh", 0003);
		details.getEmployeeAddress("Alwarpet");
		details.employeeSalary(50000);
		details.employeeMobileNumber(987654321);
		
				
	}

}
