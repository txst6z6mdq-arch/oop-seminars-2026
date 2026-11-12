package university;

public class Professor {
    
    private final String employeeId; 
    private String name;
    private String specialisation;
    private int yearsOfExperience;
    private int counter = 2000;
    
    public Professor(String name, String specialisation, int yearsOfExperience) {
        
        this.employeeId = "P" + counter;
        counter++;
        
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hapësira e emrit nuk mund të jetë bosh.");
        }
        this.name = name;
        
        if (specialisation == null || specialisation.isBlank()) {
            throw new IllegalArgumentException("Specializimi nuk mund të jetë bosh.");
        }
        this.specialisation = specialisation;
        
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Vitet e eksperiencës nuk mund të jene negative.");
        }
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String academicTitle() {
        if (yearsOfExperience <= 5) {
            return "Assistant Professor";
        } else if (yearsOfExperience <= 10) { 
            return "Associate Professor";
        } else {
            return "Professor";
        }
    }
    
    public boolean isExperienced() {
        return yearsOfExperience > 5;
    }
    
    public void completeAnotherYear() {
        yearsOfExperience++;
    }
   
    @Override
    public String toString() {
        return "Professor [ID: " + employeeId + ", Name: " + name + 
               ", Specialisation: " + specialisation + ", Years: " + yearsOfExperience + 
               " (" + academicTitle() + ")]";
    }
}
