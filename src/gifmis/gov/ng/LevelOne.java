package gifmis.gov.ng;

public class LevelOne extends Students{
    public static void main(String[] args) {
        // Fred, handle this part
        Students student = new Students();
        student.setName("Luqman");
        student.setFaculty("Information Technology & Applied Sciences");
        student.setDepartment("Mathematical Science");
        student.setCourse("Computer Science");
        student.setMatriculation_number("LCU/UG/08/3074");
        student.setCourseCode("CMP101");
        student.setCourseTitle("Introduction to programming");
        student.setLevel(100);
        System.out.println("Student Name: "+student.getName());
        System.out.println("University: "+student.getUniversity());
        System.out.println("Faculty: "+student.getFaculty());
        System.out.println("Department: "+student.getDepartment());
        System.out.println("Course of study: "+student.getCourse());
        System.out.println("Level: "+student.getLevel());
        System.out.println("Matriculation No.: "+student.getMatriculation_number());
        System.out.println("Student Course code: "+student.getCourseCode());
        System.out.println("Student Course Title: "+student.getCourseTitle());
    }
}
