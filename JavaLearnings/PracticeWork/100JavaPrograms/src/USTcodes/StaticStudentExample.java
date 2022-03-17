package USTcodes;

class Student
{
	int rollNo;
	String name;
	static String collegeName;//static variable
}


public class StaticStudentExample
{
	public static void main(String[] args)
	{
		//create 3 object which will share collegeName value
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		//assign value to static variable collegeName
		Student.collegeName="Topper ";
		//assign values to instance variables
		s1.rollNo=1;
		s1.name="stud1";

		s2.rollNo=2;
		s2.name="stud2";

		s3.rollNo=3;
		s3.name="stud3";

		//Print the values of the objects
		System.out.println("S1 Roll No.= "+s1.rollNo+" S1 Name= "+s1.name+" S1 College Name= "+s1.collegeName );
		System.out.println("S2 Roll No.= "+s2.rollNo+" S2 Name= "+s2.name+" S2 College Name= "+s2.collegeName );
		System.out.println("S3 Roll No.= "+s3.rollNo+" S3 Name= "+s3.name+" S3 College Name= "+s3.collegeName );

		//if one object change the value of static variable then it will reflect into all objects
		s2.collegeName="my college";
		s2.name="ABC";

		//Print the values of the objects after change
		System.out.println("S1 Roll No.= "+s1.rollNo+" S1 Name= "+s1.name+" S1 College Name= "+s1.collegeName );
		System.out.println("S2 Roll No.= "+s2.rollNo+" S2 Name= "+s2.name+" S2 College Name= "+s2.collegeName );
		System.out.println("S3 Roll No.= "+s3.rollNo+" S3 Name= "+s3.name+" S3 College Name= "+s3.collegeName );
	}
}
