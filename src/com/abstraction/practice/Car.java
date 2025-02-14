package com.abstraction.practice;

//creat an interface vehicle create abstract methods fueltype() start() stopEngine()
	//  --> create 2 classes bike and car 
	//  and implemtn them in those classes 
interface vehicle
{
 public abstract void fuelType();
 public abstract void startEngine();
 public abstract void stopEngine();
}
public class Car implements vehicle{
    public void carType()
    {
    	System.out.println("4 X 4");
    }
	@Override
	public void fuelType() {
      System.out.println("Petrol");		
	}

	@Override
	public void startEngine() {
		System.out.println("Start engine of car");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Stop Engine Car");
	}
	
	
	
	
	   

}
