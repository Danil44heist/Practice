package homework3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library1 = new Library();
        library1.setBookTitle("100 лет одиночества");
        library1.setAuthor("Г. Г. Маркес");
        library1.setYear(1967);
        library1.setCategory("Роман");

        //обращение к приватному полю bookTitle
        //произойдет ошибка компиляции т.к вызывов происход из другого класса
        //System.out.println(library1.bookTitle);
        //library1.bookTitle = "150 Лет Одиночества";

        //к приватному полю можно обратиться через геттер, напрямую черерз объект - нет
        System.out.println(library1.getBookTitle());

        //успешное обращение к protected полю author в классе LibraryTest т.к они находятся в одном пакете
        System.out.println(library1.author);

        //успешное обращение к default полю year в классе LibraryTest т.к они находятся в одном пакете
        System.out.println(library1.year);

        //поле category имеет модификтор доступа public - доступ из любой точки в программе
        System.out.println(library1.category);
    }
}
