package Lesson_18;

public class Threadclass extends  Thread{

StringBuffer sb=new StringBuffer("Elnur");




    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(sb.append("Why"));

        }
        
        
        
    }


}



