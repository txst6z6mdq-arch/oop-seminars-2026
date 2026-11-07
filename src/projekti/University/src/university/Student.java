package university;

public class Student {

	// ATRIBUTET
	
	private final String studentId;
	private String name;
	private double gpa;
	private final int enrolmentYear;
	
	// KONSTRUKTORI
	
	public Student(String studentId, String name, double gpa, int enrolmentYear) {
		
		if(studentId == null || student.isBlank()) {
			throw new IllegalArgumentException("Id e studentit nuk mund te jete bosh.");
		}
		this.studentId = studentId;
		
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("Emri i studentit nuk mund te jete bosh.");
		}
		this.name = name;
		
		this.gpa = 0.0;
		
		int currentYear = year.now().getValue();
        if (enrolmentYear < 2000 || enrolmentYear > currentYear) {
            throw new IllegalArgumentException("Viti i regjistrimit duhet të jete midis 2000 dhe " + currentYear);
        }
        this.enrolmentYear = enrolmentYear;
	   }

	  // METODAT
	
	public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Emri nuk mund të jetë bosh.");
        }
        this.name = name;
    }
	
	    public void updateGpa(double newGpa) {
		if(newGpa < 0.0 || newGpa > 4.0) {
			throw new IllegalArgumentExpection("Gpa duhet te jete midis 0.0 dhe 4.0.");
		}
		this.gpa = newGpa;
	   }
	
	    public String academicStanding() {
	    	if(gpa >= 2.0) {
	    		return "Good standing";
	    	} else if (gpa >= 1.5) {
	    		"Academic probation";
	    	} else { 
	    		return "Academic warning";
	    	}
	    }
	    public int yearsEnrolled(int currentYear) {
	        if (currentYear < enrolmentYear) {
	            throw new IllegalArgumentException("Viti aktual nuk mund te jete para vitit te regjistrimit.");
	        }
	        return currentYear - enrolmentYear;
	    }
	    
	    public double getGpa() {
	        return gpa;
	    }

	    public int getEnrolmentYear() {
	        return enrolmentYear;
	    }
	    
	    @Override
	    public String toString() {
	        return name + " (ID: " + studentId + ", GPA: " + gpa + ", Statusi: " + academicStanding() + ")";
	    }
}
