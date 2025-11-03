package Class6;


import java.util.List;
import java.util.Objects;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        if (title.equals(book.getTitle())){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + '}';
    }
}
