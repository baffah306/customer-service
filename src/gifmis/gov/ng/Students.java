package gifmis.gov.ng;

public class Students extends StudentCourse {
    private String name;
    private String department;
    private String faculty;
    private String course;
    private int level;
    private String matriculation_number;
    private String university = "Lead City University";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMatriculation_number() {
        return matriculation_number;
    }

    public void setMatriculation_number(String matriculation_number) {
        this.matriculation_number = matriculation_number;
    }

    public String getUniversity(){
        return university;
    }

}
