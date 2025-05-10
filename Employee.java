package com.emp.data;

public class Employee {
	String name;
	int empid;
	double salary;
	Employee(String name,int empid,double salary)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
	public String showDetails()
	{
		return "Emp name : "+name+"\n"+"empid : "+empid+"\n"+"salary : "+salary;	
	}
	
	double calculateBonus()
	{
		return salary*0.05;
	}
}


class Manager extends Employee
{

	Manager(String name, int empid, double salary) {
		super(name, empid, salary);
	}
	
	double calculateBonus()
	{
		return salary*0.20;
	}	
}

class Developer extends Employee
{

	Developer(String name, int empid, double salary) {
		super(name, empid, salary);
		// TODO Auto-generated constructor stub
	}
	double calculateBonus()
	{
		return salary*0.15;
	}	
	public void writeCode()
	{
		System.out.println("Develop apps.....Do technical");
	}
}
class Intern extends Employee
{

	Intern(String name, int empid, double salary) {
		super(name, empid, salary);
		
	}
	
	double calculateBonus()
	{
		return salary+1000;
	}
	
	
}


