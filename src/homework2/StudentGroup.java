package homework2;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    StudentGroup(String someGroupName, int someStudentCount){
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    String getGroupName(){
        return this.groupName;
    }

    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    void printInfo(){
        System.out.println("Имя группы: " + this.groupName + ", количество студентов: " + this.studentCount);
    }
}
