package Lesson_13.NormalLevel;

public class Rectangle extends Shape {

  private   int length;
   private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
       super.calculateArea();
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }


}
