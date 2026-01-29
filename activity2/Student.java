package activity2;

//1
public class Student {
    // 2
    int studentId;
    String firstName, middleName, lastName, gender, email;
    // 3
    static int totalStudents = 0;

    // 4
    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        totalStudents++;
    }

    // 5
    public void displayStudentInfo() {
        System.out.println("\n ----- Student Info -----");
        System.out.println("Student ID: " + studentId);
        System.out.println("First name " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
    }

    // 6
    public static int getTotalStudents() {
        return totalStudents;
    }

}
