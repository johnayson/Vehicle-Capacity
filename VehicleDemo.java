/*
 * Class: CS 111B Objected-Oriented Programming Methodologies in Java
 * Description: Driver class that demonstrates the person,vehicle and truck class.
 * Due date: 10/23/2015
 * File name: VehicleDemo.java
 * Assignment #6
 * Programmed by John Ayson.
 */
public class VehicleDemo
{

	public static void main(String[] args)
	{	
		System.out.println("p1: ");
		String name = "Bob";
		Person p1 = new Person(name);
		System.out.println("p1" + p1.toString());
		String name2 = "Joe";
		Person p2 = new Person(name2);
		Person p3 = new Person(p1);
		System.out.println("p2: " + p2.getName());
		System.out.println("p3: " + p3.getName());
		System.out.println("p3 equal to p1: " + p3.equals(p1));
		System.out.println("p2 equal to p1: " + p2.equals(p1));
		
		Vehicle v1 = new Vehicle();
		System.out.println("v1: " + v1.toString());
		String car = "Ford";
		v1.setmName(car);
		v1.setcylinders(4);
		v1.setowner(p2);

		System.out.println("v1's manufacturer is: " + v1.getmName());
		System.out.println("v1's cylinders: " + v1.getcylinders());	
		System.out.println("v1's owner: " + v1.getowner().getName()); 
		Person p4 = new Person("Betty");
		String car2 = "Chevy";
		Vehicle v2 = new Vehicle(car2, 4,p4 );
		System.out.println("v2: " + v2);
		Vehicle v3 = new Vehicle(v1);
		System.out.println("v3: " + v3);
		System.out.println("v3 equal to v1: " + v3.equals(v1));
		System.out.println("v2 equal to v1: " + v2.equals(v1));
		
		Truck t1 = new Truck();
		System.out.println("t1: " + t1);
		t1.setloadCapacity(54.36);
		System.out.println("t1's load capacity is: " + t1.getloadCapacity());
		t1.settowCapacity(10);
		System.out.println("t1's towing capacity is: " + t1.gettowCapacity());
		Truck t2 = new Truck(v2,34.5,65);
		System.out.println("t2: " + t2);

		Truck t3 = t1;
		System.out.println("t3: " + t3);
		System.out.println("t3 equal to t1: " + t3.equals(t1));
		System.out.println("t2 equal to t1: " + t2.equals(t1));
	}

}
