package university;

public class Course {
    private final String courseCode;
    private String title;
    private int credits;
    private String semester;
    private static int counter = 100;
    
    // Konstruktori 
    public Course(String title, int credits, String semester) {
        this.courseCode = "CS" + counter++;
        
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank or null.");
        }
        this.title = title;
        
        if (credits < 1 || credits > 6) {
            throw new IllegalArgumentException("Credits need to be between 1 and 6.");
        }
        this.credits = credits;
        
        if (semester == null || semester.isBlank()) {
            throw new IllegalArgumentException("Semester cannot be blank or null.");
        }
        this.semester = semester;
    }
    
    // Getters
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public String getSemester() {
        return semester;
    }
    
    // Setters
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank or null.");
        }
        this.title = title;
    }
    
    // Metoda e biznesit: Kthen true nëse lënda ka 3 ose më shumë kredite
    public boolean isMajorCourse() {
        return credits >= 3;
    }
    
    // Metoda toString për printimin e objektit
    @Override
    public String toString() {
        return courseCode + ": " + title + " (" + credits + " credits, " + semester + ")";
    }
}