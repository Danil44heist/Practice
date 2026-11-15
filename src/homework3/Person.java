package homework3;

public class Person {
    private String fistName;
    private String lastName;
    private final String ssn;

    Person(String someFistName, String someLastName, String someSsn){
        this.fistName = someFistName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    String getFistName() {
        return this.fistName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFistName(String newFistName) {
        this.fistName = newFistName;
    }

    void  setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        System.out.println("Имя: " + this.fistName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn);
    }
}
