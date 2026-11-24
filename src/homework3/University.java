package homework3;

public class University {
    private static String universityName;
    private final int studentID;
    private String studentName;

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

    final void printStudentInfo() {
        System.out.println(this.studentName + " " + this.studentID + " " + " " + universityName);
    }


}
