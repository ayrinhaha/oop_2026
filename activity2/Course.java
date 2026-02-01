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
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];

    }

    // 5
    public void enrollStudent(Student student) {
        if (enrollmentCount < enrolledStudents.length) {
            enrolledStudents[enrollmentCount] = student;
            enrollmentCount++;
        } else {
            System.out.println("Course full");
        }
    }

    // 5.1
    public void displayCourseInfo() {
        System.out.println("\n-------- COURSE INFORMATION --------");
        System.out.printf("%-15s: %s%n", "School name", schoolName);
        System.out.printf("%-15s: %s%n", "Course code", courseCode);
        System.out.printf("%-15s: %s%n", "Course title", courseTitle);
        System.out.println("\nEnrolled students:\n");

        for (int i = 0; i < enrollmentCount; i++) {
            enrolledStudents[i].displayStudentInfo();
            System.out.println();
        }
    }

    // 6
    public static String getSchoolName() {
        return schoolName;
    }
}
