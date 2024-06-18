package Lesson_12;

import java.util.Objects;

public class PersonEnc {


    private   String name;
    private int age;


    public PersonEnc(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        PersonEnc person = new PersonEnc("Elnur", 28);
        PersonEnc person1 = new PersonEnc("Eli", 26);
        System.out.println("Person Name " + person.getName());
        System.out.println("Person Age " + person.getName());


        person.setName("Mikayil");
        person.setAge(30);
        System.out.println("New Name " + person.getName());
        System.out.println("New Age " + person.getAge());


        System.out.println("Check Person to Person1 " + person.equals(person1));
        System.out.println("Person hash code " + person.hashCode());
        System.out.println("Person1 hash code   " + person1.hashCode());


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEnc personEnc = (PersonEnc) o;
        return age == personEnc.age && Objects.equals(name, personEnc.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}