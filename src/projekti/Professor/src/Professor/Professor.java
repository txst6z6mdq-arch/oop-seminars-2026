package Professor;

public class Professor {
	
	// 1. ATRIBUTET

	private final String employeedId;
	private String name;
	private String specialisation;
	private int yearsOfExperience;
	
	
	// 2. KONSTRUKTORI
	
	public Professor( String specialisatId, String name, String specialisation,
	int yearsOfExperience) {
		
		if (employeeId == null || employeeId.isBlank()) {
            throw new IllegalArgumentException("ID e punonjesit nuk mund te jete bosh.");
        }
		this.employeeId = employeeId;
		
		
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name can not be blank!");
		}
		this.name = name;
		
		
		if(specialisation == null || specialisation.isBlank()) {
			throw new IllegalArgumentException("Specialisation can not be blank!");
		}
		this.specialisation = specialisation;
		
		
		if(yearsOfExperience < 0) {
			throw new IllegalArgumentException()
		}
		this.yearsOfExperience = yearsOfExperience;
		
	}
	
	// 3. METODAT
	
	 // Percakton titullin akademik
	
	public String academicTitle() {
        if (yearsOfExperience <= 5) {
            return "Assistant Professor";
        } else if (yearsOfExperience <= 10) {
            return "Associate Professor";
        } else {
            return "Professor";
        }
    }
	
	// Kthen true nese profesori ka me shume se 5 vite
	
	public boolean isExperienced() {
		return yearsOfExperience > 5;
	}
	
	// Shton 1 vit ne eksperience
	
	public void completeAnotherYear() {
		this.yearsOfExperience++;
	}
	
	// Getters and Setters
	
	public String getEmployeeId() {
		return employeedId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecialisation() {
		return specialisation;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	@Override
    public String toString() {
        return name + " (" + academicTitle() + ", " + specialisation + ")";
    }
				
	}
