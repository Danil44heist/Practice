package homework3;

public class Main {
    public static void main(String[] args) {
        //Company
        Company cp1 = new Company(1, "Программист");
        Company cp2 = new Company(2, "Аналитик");
        System.out.println(cp1.getEmployeeName());
        System.out.println(cp2.getEmployeeName());
        Company.companyName = "Рога и копыта";
        System.out.println(Company.companyName);

        //изменение employeeID у cp1
        //cp1.employeeID = 10;

        //MathConstants
        System.out.println(MathConstants.calculateCircleArea(4.15));
        System.out.println(MathConstants.calculateCircumference(15.5));
        System.out.println(MathConstants.calculateExponentialGrowth(10,5.5,40));

        //University
        University student1 = new University(1, "Иванов А.И");
        University student2 = new University(2, "Сидоров Д.С");
        University student3 = new University(3, "Петров Е.Ю");
        University.changeUniversityName("МФТИ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.changeUniversityName("МГУ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        //GameSettings
        GameSettings game1 = new GameSettings("В поисках Немо", 15);
        GameSettings game2 = new GameSettings("В поисках Дори", 130);
        GameSettings.setMaxPlayers(512);
        System.out.println(game1.addPlayer());
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        //Person
        Person p1 = new Person("Иван", "Иванов", "123-45-6789");
        Person p2 = new Person("Денис", "Денисов", "155-53-4421");
        Person p3 = new Person("Ольга", "Фролова", "155-11-2009");
        p1.setFirstName("Ваня");
        p1.printPersonInfo();
        p2.printPersonInfo();
        p3.printPersonInfo();



    }
}
