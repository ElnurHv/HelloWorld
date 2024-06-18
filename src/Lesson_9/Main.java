package Lesson_9;

public class Main {
    public static void main(String[] args) {
        Author ar=new Author("Lev Tolstoy ",1828);
        Author ar1=new Author("Dosteyevski",1862);



        Book bk=new Book("Anna Karenina",ar,1877);
        Book bk1=new Book(" War and Peace ",ar,1869);
        Book bk2=new Book("Hadji Murat",ar,1912);
        Book bk3=new Book("Crime and Punishment",ar1,1866);
        Book bk4=new Book("The Brothers Karamazov",ar1,1880);
        Book bk5=new Book("The Gambler",ar1,1867);

        


        System.out.println(bk);
        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
        System.out.println(bk4);
        System.out.println(bk5);

    }
}
