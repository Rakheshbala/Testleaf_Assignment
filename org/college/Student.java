package org.college;

public class Student extends Department{
	public void studentName(String name) {
		System.out.println("Name :"+name);
	}
	public void studentDept(String dept) {
		System.out.println("Student Dept :"+dept);
	}
	public void studentId(int id){
		System.out.println("Student ID :"+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
	//-grand parent
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		//to print next line u can use empty system.out,println();
		System.out.println();
	//-parent
		student.deptName();
		System.out.println();
	//-child	
		student.studentName("Bala");
		student.studentDept("Computer Science");
		student.studentId(03);
	}

}
