package constrctor;

public class Student {

	int rollno;
	double total;
	String name;
	char grade;
	
	
	
	public Student(int rollno, double total, String name, char grade) {
		
		this.rollno = rollno;
		this.total = total;
		this.name = name;
		this.grade = grade;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,96.8,"Bala",'A');
		Student s2=new Student(2,69.8,"Arun",'B');
		Student s3=new Student(3,58.8,"kani",'C');
		Student s4=new Student(4,97.8,"parvathy",'A');
		
		System.out.println(s1.name);
		System.out.println(s3.grade);
		System.out.println(s2.total);
		System.out.println(s4.rollno);

	}

}
