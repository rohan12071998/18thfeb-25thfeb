package Feb18th;
class Employee{
	String name;
	int EmployeeId;
	
	void Employeedetails() {
		System.out.println(this.name);
		System.out.println(this.EmployeeId);
		
	}

//public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1=new Employee();
		Employee s2=new Employee();
		Employee s3=new Employee();
		Employee s4=new Employee();
		
		s1.name="john";
		s1. EmployeeId=234;
		
		s2.name="rohan";
		s2. EmployeeId=456;
		
		s3.name="bijay";
		s3. EmployeeId=300;
		
		s4.name="ana";
		s4. EmployeeId=899;
		
		
		s1. Employeedetails();
		s2. Employeedetails();
		s3. Employeedetails();
		s4. Employeedetails();
		
		
		
		
		

	}

}
