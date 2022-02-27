package Feb18th;
class Student{
	String name;
	int roll;
	long phonenum;
	String adress;
	void Studentdetails() {
		System.out.println(this.name);
		System.out.println(this.roll);
		System.out.println(this.phonenum);
		System.out.println(this.adress);
	}


//public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.name="john";
		s1.roll=2;
		s1.phonenum=283940583084045l;
		s1.adress="chittaranjan";
		s2.name="rohit";
		s2.roll=5;
		s2.phonenum=283940583084045l;
		s2.adress="chittaranjan";
		s1.Studentdetails();
		s2.Studentdetails();
		
		
		
		
		
		
		
		

	}

}
