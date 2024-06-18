package Lesson_8;

public class CarMain {
    public static void main(String[] args) {
        Car cr=new Car();
        cr.make="Hyundai";
        cr.model="i30";
        cr.year=2009;
        cr.isOldCar=(cr.year>2010);

        System.out.println("Car details");
        System.out.println("Car name "+cr.make);
        System.out.println("Car name "+cr.model);
        System.out.println("Car name "+cr.year);
        cr.NeworOld(cr.isOldCar);

    }





}



