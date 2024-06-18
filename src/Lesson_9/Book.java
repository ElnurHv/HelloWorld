package Lesson_9;

public class Book {
    String title;
    Author author;
    int publicyear;

    public Book(String title, Author author, int publicyear) {
        this.title = title;
        this.author = author;
        this.publicyear = publicyear;
    }
    Author ar;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicyear=" + publicyear +
                ", ar=" + ar +
                '}';
    }
}
