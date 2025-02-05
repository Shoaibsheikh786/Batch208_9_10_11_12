package com.practice2.methodsagain;
class Employee
{
	// instance variable --> age , id , salary ; default 0
	//--> get the data with by methods 
	//--> print the data by methods 
	
	int age;
	int id;
	float salary;
	
	void getId(int a)
	{
		id=a;
	}
	void getAge(int b)
	{
		age=b;
	}
	void getSalary(float sal)
	{
		salary=sal;
	}
	//print age id and salray
	void printAllDetails()
	{  
	
		System.out.println("Age -> "+age);
		System.out.println("id -> "+id);
		System.out.println("salary -> "+salary);
	}
	
}
public class Method3 {

	public static void main(String[] args) {
      
		Employee obj1=new Employee();
		Employee obj2=new Employee();
	    obj1.getAge(10);
	    obj1.getId(100);
	    obj1.getSalary(200.0f);
	    obj2.printAllDetails();
	    obj1.printAllDetails();
	}

}
