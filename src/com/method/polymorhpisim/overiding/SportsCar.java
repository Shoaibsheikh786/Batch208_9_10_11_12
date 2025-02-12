package com.method.polymorhpisim.overiding;
class Car
{
	public void brake()
	{
		System.out.println("Break in car A");
	}
	public void shiftGear()
	{
		System.out.println("Shift Grear in Car, 4 gears");
	}
	public void accelrator()             //signature //
	{  
		//definition
		System.out.println("Accelarotr in Car");
	}
	
	public static void main(String[] args) {
		Car c1=new Car();
		c1.shiftGear();     //method call
	}


	
}
public class SportsCar extends Car {
	public void booster()
	{
		System.out.println("this is sports car booster");
	}
	public void shiftGear()
	{
		System.out.println("Shift Grear in Car, 5 gears");
	}
	
	public static void main(String[] args) {
		
		SportsCar s1=new SportsCar();
		s1.brake();
		s1.shiftGear();
		s1.accelrator();
		s1.booster();
	
	 
	     
	}

}
