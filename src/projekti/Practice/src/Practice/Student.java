package Practice;

public class Student 
{
	// 1. Attributes 
	
	String name;
	String surname;
	int id;
	int age;
	double average;
	
	// 2. Construstor
	
	public Student(String name, String surname, int id, int age, double average) 
	{
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.age = age;
		this.average = average;
	 }

     // 3. Methods
   
// A. Method to show information
    public void showInfo() 
    {
    	System.out.println("id: " + id + " | Name: " + name + " " + surname + " + | Average: " + average);
  
    }
    
 // B. Method to get full name
    public String getFullName() 
    {
    	return name + " " + surname;
    }
    
 // C. Method if passed 
    public boolean hasPassed()
    {
    	return average >= 5.0;
    }
    
 // D. Method to update average
    public void updateAverage(double newAverage)
    {
    	this.average = newAverage;
    }
}