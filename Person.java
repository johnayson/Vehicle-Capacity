

public class Person
{
	private String name;  //person's name
	
	//default constructor
	public Person()
	{}
	
	//constructor that initializes the name
	public Person(String theName)
	{
		name = theName;
	}
	
	//copy constructor
	public Person(Person theObject)
	{
		name = theObject.getName();
	}
	
	//fetches the person's name
	public String getName()
	{
		return name;
	}
	
	//sets the name.
	public void setName(String theName)
	{
		name = theName;
	}
	
	//Prints the person's name
	public String toString()
	{
		String s1 ="";
		s1 += "'s name is : " + name;
		return s1;
		
	}
	
	//check if the Person object passed is the same as calling object. 
	public boolean equals (Person other)
	{
		boolean match;
		
		if(other.getName().equals(name))
			match = true;
		else
			match = false;
		
		return match;
	}
}
