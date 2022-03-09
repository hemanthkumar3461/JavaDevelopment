/*
 * public class SchoolManagementCodes {
 * 
 * }
 * 
 * 
 * package com.school.project;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * public class Main { public static void main(String[] args) { Teacher lizzy =
 * new Teacher(1,"Lizzy",500); Teacher mellisa = new Teacher(2,"Mellisa",700);
 * Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);
 * 
 * List<Teacher> teacherList = new ArrayList<>(); teacherList.add(lizzy);
 * teacherList.add(mellisa); teacherList.add(vanderhorn);
 * 
 * 
 * Student tamasha = new Student(1,"Tamasha",4); Student rakshith = new
 * Student(2,"Rakshith Vasudev",12); Student rabbi = new Student(3,"Rabbi",5);
 * List<Student> studentList = new ArrayList<>();
 * 
 * studentList.add(tamasha); studentList.add(rabbi); studentList.add(rakshith);
 * 
 * School ghs = new School(teacherList,studentList);
 * 
 * Teacher megan = new Teacher(6,"Megan", 900);
 * 
 * ghs.addTeacher(megan);
 * 
 * 
 * tamasha.payFees(5000); rakshith.payFees(6000);
 * System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());
 * 
 * System.out.println("------Making SCHOOL PAY SALARY----");
 * lizzy.receiveSalary(lizzy.getSalary());
 * System.out.println("GHS has spent for salary to " + lizzy.getName()
 * +" and now has $" + ghs.getTotalMoneyEarned());
 * 
 * vanderhorn.receiveSalary(vanderhorn.getSalary());
 * System.out.println("GHS has spent for salary to " + vanderhorn.getName()
 * +" and now has $" + ghs.getTotalMoneyEarned());
 * 
 * 
 * System.out.println(rakshith);
 * 
 * mellisa.receiveSalary(mellisa.getSalary());
 * 
 * System.out.println(mellisa);
 * 
 * 
 * } } //
 * 
 * package com.school.project;
 * 
 * import java.util.List;
 * 
 * public class School {
 * 
 * private List<Teacher> teachers; private List<Student> students; private
 * static int totalMoneyEarned; private static int totalMoneySpent;
 * 
 *//**
	 * new school object is created.
	 * 
	 * @param teachers list of teachers in the school.
	 * @param students list of students int the school.
	 */
/*
 * public School(List<Teacher> teachers, List<Student> students) { this.teachers
 * = teachers; this.students = students; totalMoneyEarned=0; totalMoneySpent=0;
 * }
 * 
 *//**
	 *
	 * @return the list of teachers int the school.
	 */
/*
 * public List<Teacher> getTeachers() { return teachers; }
 * 
 *//**
	 * Adds a teacher to the school.
	 * 
	 * @param teacher the teacher to be added.
	 */
/*
 * public void addTeacher(Teacher teacher) { teachers.add(teacher); }
 * 
 *//**
	 *
	 * @return the list of students in the school.
	 */
/*
 * public List<Student> getStudents() { return students; }
 * 
 *//**
	 * Adds a student to the school
	 * 
	 * @param student the student to be added.
	 */
/*
 * public void addStudent(Student student) { students.add(student); }
 * 
 *//**
	 *
	 * @return the total money earned by the school.
	 */
/*
 * public int getTotalMoneyEarned() { return totalMoneyEarned; }
 * 
 *//**
	 * Adds the total money earned by the school.
	 * 
	 * @param MoneyEarned money that is supposed to be added.
	 */
/*
 * public static void updateTotalMoneyEarned(int MoneyEarned) { totalMoneyEarned
 * += MoneyEarned; }
 * 
 *//**
	 *
	 * @return the total money spent by the school.
	 */
/*
 * public int getTotalMoneySpent() { return totalMoneySpent; }
 * 
 *//**
	 * update the money that is spent by the school which is the salary given by the
	 * school to its teachers.
	 * 
	 * @param moneySpent the money spent by school.
	 */
/*
 * public static void updateTotalMoneySpent(int moneySpent) {
 * totalMoneyEarned-=moneySpent; } } // package com.school.project;
 * 
 * public class Student {
 * 
 * private int id; private String name; private int grade; private int feesPaid;
 * private int feesTotal; public Student(int id, String name,int grade){
 * this.feesPaid=0; this.feesTotal=30000; this.id=id; this.name=name;
 * this.grade=grade;
 * 
 * } public void setGrade(int grade){ this.grade=grade; }
 * 
 * 
 *//**
	 * Keep adding the fees to feesPaid Field. Add the fees to the fees paid. The
	 * school is going receive the funds.
	 *
	 * @param fees the fees that the student pays.
	 */
/*
 * public void payFees(int fees){ feesPaid+=fees;
 * School.updateTotalMoneyEarned(feesPaid); }
 * 
 *//**
	 *
	 * @return id of the student.
	 */
/*
 * public int getId() { return id; }
 * 
 *//**
	 *
	 * @return name of the student.
	 */
/*
 * public String getName() { return name; }
 * 
 *//**
	 *
	 * @return the grade of the student.
	 */
/*
 * public int getGrade() { return grade; }
 * 
 *//**
	 *
	 * @return fees paid by the student.
	 */
/*
 * public int getFeesPaid() { return feesPaid; }
 * 
 *//**
	 *
	 * @return the total fees of the student.
	 */
/*
 * public int getFeesTotal() { return feesTotal; }
 * 
 *//**
	 *
	 * @return the remaining fees.
	 */
/*
 * public int getRemainingFees(){ return feesTotal-feesPaid; }
 * 
 * @Override public String toString() { return "Student's name :"+name+
 * " Total fees paid so far $"+ feesPaid; } }
 * 
 * 
 * 
 * // package com.school.project;
 * 
 * public class Teacher {
 * 
 * private int id; private String name; private int salary; private int
 * salaryEarned;
 * 
 *//**
	 * Creates a new Teacher object.
	 * 
	 * @param id     id for the teacher.
	 * @param name   name of the teacher.
	 * @param salary salary of the teacher.
	 */
/*
 * public Teacher(int id, String name, int salary){ this.id=id; this.name=name;
 * this.salary=salary; this.salaryEarned=0; }
 * 
 *//**
	 *
	 * @return the id of the teacher.
	 */
/*
 * public int getId(){ return id; }
 * 
 *//**
	 *
	 * @return name of the teacher.
	 */
/*
 * public String getName(){ return name; }
 * 
 * 
 *//**
	 *
	 * @return the salary of the teacher.
	 */
/*
 * public int getSalary(){ return salary; }
 * 
 *//**
	 * set the salary.
	 * 
	 * @param salary
	 */
/*
 * public void setSalary(int salary){ this.salary=salary; }
 * 
 *//**
	 * Adds to salaryEarned. Removes from the total money earned by the school.
	 * 
	 * @param salary
	 *//*
		 * public void receiveSalary(int salary){ salaryEarned+=salary;
		 * School.updateTotalMoneySpent(salary); }
		 * 
		 * 
		 * @Override public String toString() { return "Name of the Teacher: " + name
		 * +" Total salary earned so far $" + salaryEarned; } }
		 */