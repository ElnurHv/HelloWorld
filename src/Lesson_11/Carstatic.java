package Lesson_11;

public class Carstatic {


    static  int count=0;
   public Carstatic() {
       count++;

   }

    public void main(String[] args) {
        Carstatic c1=new Carstatic();
        Carstatic c2=new Carstatic();
        Carstatic c3=new Carstatic();
        System.out.println("Count "+Carstatic.count);
    }

}
