package homework3;

public class Library {
    // пояснения оставил в классе LibratyTest
    private String bookTitle; // доступ внутри класса
    protected String author; // доступ в том же пакете и подклассах
    int year; // доступ в том же пакете
    public String category; // доступ для всех

    String getBookTitle() {
        return this.bookTitle;
    }

    void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    String getCategory() {
        return this.category;
    }

    void setCategory(String newCategory) {
        this.category = newCategory;
    }

}
