/*
 * Class: CS 111B Objected-Oriented Programming Methodologies in Java
 * Description: Class vehicle that contains owner,manufacturer and cylinders of a vehicle.
 * Due date: 10/23/2015
 * File name: Vehicle.java
 * Assignment #6
 * Programmed by John Ayson.
 */
public class Vehicle 
{
	protected String mName;  //manufacturer's name
	protected int cylinders;  //number of cylinders
	protected Person owner;  //vehicle's owner
	
	//constructor that initializes manufacturer,cylinder and owner.
	public Vehicle (String theName, int cyl, Person hum)
	{
		mName = theName; 
		cylinders = cyl;
		owner = hum;
	}
	
	//default constructor
	public Vehicle()
	{
		String none = "None";
		Person temp = new Person("");
		mName = none;
		owner = temp;
		
	}
	
	//copy constructor
	public Vehicle(Vehicle obj)
	{
		mName = obj.getmName();
		cylinders = obj.getcylinders();
		owner = obj.getowner();
	}
	
	//sets the manufacturer's name
	public void setmName(String make)
	{
		mName = make;
	}
	
	//sets the cylinder
	public void setcylinders(int num)
	{
		cylinders = num;
	}
	
	//sets the owner
	public void setowner(Person pers)
	{
		owner = pers;
	}
	
	//fetches the manufacturer
	public String getmName()
	{
		return mName;
	}
	
	//fetches number of cylinders
	public int getcylinders()
	{
		return cylinders;
	}
	
	//fetches the owner
	public Person getowner()
	{
		return owner;
	}
	
	//prints the make,cylinders and owner.
	public String toString()
	{
		String s1 = "";
		s1 += mName + ", " + cylinders + " cylinders, " + "owned by " + owner.getName();
		return s1;
	}
	
	//checks if the caller function is the same with the vehicle other.
	public boolean equals(Vehicle other)
	{
		boolean match;
		
		if(other.getmName().equals(mName) && other.getcylinders() == cylinders 
			  && other.getowner().equals(owner))
		   match =true;
		else
		   match = false;
		
		return match;
	}
}
