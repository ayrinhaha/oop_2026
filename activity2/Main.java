package activity2;

//1
public class Main {
    public static void main(String[] args) {

        // 2.1
        System.out.println("Total number of students: " + Student.getTotalStudents());
        // 2.2
        Student s1 = new Student(1234, "Rasty Anne", "Gavina", "Galvan", "Female", "rastyannegalvan@gmail.com");
        Student s2 = new Student(5678, "Irene Mae", "Badua", "Pingol", "Female", "irenemae.pingol@lorma.edu");
        Student s3 = new Student(1234, "Yae", "Miko", "Batumbakal", "Female", "yaemiko@gmail.com");
        // 2.3
        System.out.println("Total number of students: " + Student.getTotalStudents());
        // 2.4
        s1.displayStudentInfo();

        // 3.1
        Course.getSchoolName();

        // 3.2
        Course ofcourse = new Course("CS101", "Introduction to Programming");

        // 3.3
        ofcourse.enrollStudent(s1);
        ofcourse.enrollStudent(s2);

        ofcourse.displayCourseInfo();

    }
}
