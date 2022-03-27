package JavaPractice;

import java.io.*;
public class InstanceVariable{ //Employee class
	// this instance variable is visible for any child class.
	public String name;

	// salary variable is visible in Employee class only.
	private double salary;

	// The name variable is assigned in the constructor. 
	public InstanceVariable (String empName){
		name = empName;
	}
	// The salary variable is assigned a value.
	public void setSalary(double empSal){
		salary = empSal;
	}

	// This method prints the employee details.
	public void printEmp(){
		System.out.println("name : " + name );
		System.out.println("salary :" + salary);
	}
	public static void main(String args[]){
		InstanceVariable empOne = new InstanceVariable("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}
//Instance variables are present in inside class and outside methods