package Lesson_9;

public class Author {
    String name;
    int birthyear;

    public Author(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }
    Book bk;


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", birthyear=" + birthyear +
                ", bk=" + bk +
                '}';
    }
}
