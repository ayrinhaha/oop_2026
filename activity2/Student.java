package activity2;
//1
public class Student {
    //2
    int studentId;
    String firstName, middleName,lastName, gender, email;
    //3
    static int totalStudents = 0;
    //4
    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email){
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        totalStudents++;
    }
    //5
    public void displayStudentInfo(){

    }
    //6
    public static int getTotalStudents(){
        return totalStudents;
    }

}
