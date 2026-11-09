package homework2;

public class Main {
    public static void main(String[] args) {
        //Car
        Car bmw = new Car("BMW", 1985);
        bmw.setYear(2000);
        bmw.print();
        System.out.println();

        //Rectangle
        Rectangle rectangle1 = new Rectangle(10,15);
        rectangle1.setWidth(20);
        rectangle1.calculateArea();
        System.out.println();

        //Book
        Book book1 = new Book("Мертвые души", "Толстой Л.Н");
        book1.setAuthor("Гоголь Н.В");
        book1.printInfo();
        System.out.println();

        //BankAccount
        BankAccount q1 = new BankAccount("Ryaposov D.S", 1000.56);
        q1.deposit(100.5);
        q1.withdraw(200.40);
        q1.printBalance();
        System.out.println();

        //Point
        Point p1 = new Point(0.0, 0.0);
        p1.setX(5.5);
        p1.print();
        System.out.println();

        //StudentGroup
        StudentGroup sg1 = new StudentGroup("Seniors", 30);
        //sg1.printInfo();
        sg1.setStudentCount(31);
        sg1.printInfo();
        System.out.println();

        //Circle
        Circle c1 = new Circle(10.5);
        c1.setRadius(11.5);
        c1.calculateArea();
        c1.calculateCircumference();
        System.out.println();

        //Teacher
        Teacher t1 = new Teacher("Иванова А.А", "Физ-ра");
        t1.setSubject("Биология");
        t1.printInfo();
        System.out.println();

        //Product
        Product pr1 = new Product("Ручка", 100);
        pr1.setPrice(1000);
        pr1.applyDiscount(15);
        System.out.println("Цена с применением скидки: " + pr1.getPrice() + " рублей");
        System.out.println();

        //Laptop
        Laptop lp1 = new Laptop("Lenovo", 49990.99);
        lp1.setPrice(64990.99);
        lp1.printInfo();
    }
}
