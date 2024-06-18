package Lesson_15.Abstract;

public class Square extends Shape {

    @Override
    int calculate(int length, int width) {
       return super.calculate(length, width);
    }

    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square.calculate(5,5));
    }
}
