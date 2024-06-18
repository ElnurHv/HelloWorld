package Lesson_15.Abstract;

public abstract class Shape {
    double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
   }


   int calculate(int length,int width){
       return length * width;
   }
}
