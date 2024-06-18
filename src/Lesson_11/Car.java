package Lesson_11;


public class Car {
    String name;

    String model;
    String color;
    int year;

    public Car(String name, String model, String color, int age) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = age;
    }

    public static void main(String[] args) {
        Car car = new Car("Vaz", "21099", "Black", 1996);
        Car car1 = new Car("Opel", "Vectra", "Blue", 1996);
        Car car2 = new Car("Hyundai", "i30", "Metallic", 2009);
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", model='" + model + '\'' + ", color='" + color + '\'' + ", year=" + year + '}';
    }

}

