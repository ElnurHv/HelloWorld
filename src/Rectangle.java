import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert the Rectangle lengt");

        double lenght = scanner.nextDouble();

        System.out.println("insert the Rectangle widht");
        double widht = scanner.nextDouble();

        double perimetr = 2 * (lenght + widht);
        double area = lenght * widht;

        System.out.println("Rectangle perimetr" + perimetr);
        System.out.println("Rectangle area" + area);


    }
}
