package Leeson_10;

public class Garbage {
    public static void runGarbageCollector() {
        // Create an object
        Object obj = new Object();



        // Make the object unreachable by setting the reference to null
        obj = null;



        // Call the garbage collector to collect the unreachable object
        System.gc();
    }
}
