/*
 * Class: CS 111B Objected-Oriented Programming Methodologies in Java
 * Description: This inherits the vehicle class and adds load and tow capacity.
 * Due date: 10/23/2015
 * File name: Truck.java
 * Assignment #6
 * Programmed by John Ayson.
 */
public class Truck extends Vehicle
{
	double loadCapacity;  //keeps the load capacity.
	int towCapacity;  //keeps the tow capacity.
	
	//default constructor
	public Truck()
	{}
	
	//overloaded constructor that sets the fields to the instances passed.
	public Truck(Vehicle temp,double load,int tow)
	{
		super(temp);
		loadCapacity = load;
		towCapacity = tow;
	}
	
	//Copy Constructor
	public Truck(Truck obj)
	{
		loadCapacity = obj.getloadCapacity();
		towCapacity = obj.gettowCapacity();
	}
	
	//sets the loadCapacity
	public void setloadCapacity(double num)
	{
		loadCapacity = num;
	}
	
	//sets the towCapacity
	public void settowCapacity(int numb)
	{
		towCapacity = numb;
	}
	
	//fetches the loadCapacity
	public double getloadCapacity()
	{
		return loadCapacity;
	}
	
	//fetches the towCapacity
	public int gettowCapacity()
	{
		return towCapacity;
	}
	
	//prints out the truck class data plus inherited
	public String toString()
	{
		String s1 = "";
		s1 += super.toString();
		s1 += ",load capacity " + loadCapacity + ", towing capacity " + towCapacity;
		return s1;
	}
	
	//check if the caller is the same as the obejct passed.
	public boolean equals(Truck other)
	{
		boolean match;
		
		if(other.getloadCapacity() == loadCapacity && other.gettowCapacity() == towCapacity &&
			  other.getmName().equals(mName) && other.getcylinders() == cylinders && 
			  other.getowner().equals(owner))
		  match = true;
		else
			match = false;
		
		return match;
	}
}
