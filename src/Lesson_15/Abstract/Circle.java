package Lesson_15.Abstract;

public class Circle extends Shape {


    @Override
    double calculateArea(double radius) {
        return super.calculateArea(radius);
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println( circle.calculateArea(5));

    }
}
