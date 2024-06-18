package Lesson_13;

public class Aquatic extends Animal {
    int swimmigDepth;

    public Aquatic(String name, int age, String sound, int swimmigDepth) {
        super(name, age, sound);
        this.swimmigDepth = swimmigDepth;
    }

    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic("Finding Nemo ", 3, "Blup blup", 15);
        aquatic.swim();
    }

    public void swim() {
        System.out.println("Aquatic name :" + getName());
        System.out.println("Aquatic age :" + getAge());
        System.out.println("Aquatic sound :+" + getSound());
        System.out.println("Aquatic swiming depth :" + swimmigDepth + " Meter ");
    }


}
