package Practice;

public class main 
{
public static void main(String[] args) {
	
	// 1. Creating students 
	Student student1 = new Student("Adela", "Muzhaqi", 404, 20, 7.0);
	Student student2 = new Student("Ana", "Marie", 202, 22, 8.5);
	
	// 2. Calling methods for s1
	System.out.println("Information of the first student");
	student1.showInfo();
	
	System.out.println("Full name: " + student1.getFullName());
	System.out.println("Has passed? " + student1.hasPassed());
	
	// 3. Updating average of s2
	student2.updateAverage(9.7);
	
	System.out.println("\n After updating average");
	
  }
}
