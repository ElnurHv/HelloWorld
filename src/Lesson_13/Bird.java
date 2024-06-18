package Lesson_13;

public class Bird extends Animal {
    int vingSpan;


    public Bird(String name, int age, String sound, int vingSpan) {
        super(name, age, sound);
        this.vingSpan = vingSpan;
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", 5, "She talks like a civilized person", 20);
        bird.fly();
    }

    public void fly() {
        System.out.println("Bird: " + getName());
        System.out.println("Bird age :" + getAge());
        System.out.println("Bird sound :" + getSound());
        System.out.println("Bird vingspan :" + vingSpan + " cm ");

    }


}

