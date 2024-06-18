package Lesson_18;

public class StringBufferclass  {


    public static void main(String[] args) throws InterruptedException {





            Threadclass thread = new Threadclass();
            Threadclass thread1 = new Threadclass();

            thread.start();
            thread.join();

            thread1.start();
            thread1.join();




        }
    }

