package Lesson_13.NormalLevel;

public class Circle extends Shape {

  private   int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + area);
    }
}
