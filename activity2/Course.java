package activity2;

//1
public class Course {
    // 2
    String courseCode, courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount = 0;

    // 3
    static String schoolName = "My University";

    // 4
    public Course(String courseCode, String courseTitle) {
        this.enrolledStudents = new Student[50];

    }

    // 5
    public void enrollStudent(Student student) {
        enrolledStudents[enrollmentCount] = student;
        enrollmentCount++;
    }

    public void displayCourseInfo() {
    for()
    }

    //6
    public static String getSchoolName(){
        return schoolName;
    }
}
