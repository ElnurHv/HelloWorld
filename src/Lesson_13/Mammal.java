package Lesson_13;

public class Mammal extends Animal {
    private final String furColor;

    public Mammal(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal("Elephant", 15, "sounds like a ship's horn", "Matt Metallic");
        mammal.giveBirth();

    }

    public void giveBirth() {
        System.out.println("Mammal name: " + getName());
        System.out.println("Mammal age: " + getAge());
        System.out.println("Mammal sound: " + getSound());
        System.out.println("Mammal Color: " + furColor);


    }

}
