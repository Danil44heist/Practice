package homework3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library1 = new Library();
        library1.setBookTitle("100 лет одиночества");
        library1.setAuthor("Г. Г. Маркес");
        library1.setYear(1967);
        library1.setCategory("Роман");

        //к приватному полю можно обратиться через геттер, напрямую черерз объект - нет
        System.out.println(library1.getBookTitle());

        //ошибка компиляции
        //System.out.println(library1.bookTitle);

        System.out.println(library1.getAuthor());
        System.out.println(library1.author);

        System.out.println(library1.getYear());
        System.out.println(library1.year);

        System.out.println(library1.getCategory());
        System.out.println(library1.category);
    }
}
