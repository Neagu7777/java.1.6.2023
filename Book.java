public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int publicationYear;

    // Конструктор класса
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Метод для сравнения объектов Book по году публикации
    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.publicationYear, otherBook.publicationYear);
    }

    // Геттеры и сеттеры для полей title, author и publicationYear

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Пример использования Comparable для сравнения объектов Book
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        int result = book1.compareTo(book2);

        if (result < 0) {
            System.out.println(book1.getTitle() + " was published before " + book2.getTitle());
        } else if (result > 0) {
            System.out.println(book1.getTitle() + " was published after " + book2.getTitle());
        } else {
            System.out.println(book1.getTitle() + " and " + book2.getTitle() + " were published in the same year");
        }
    }
}
