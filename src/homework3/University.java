package homework3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static void changeUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println(this.studentName + " " + this.studentID + " " + " " + universityName);
    }


}
