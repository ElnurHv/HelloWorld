package Leeson_10;

public class StackHeap {
    public static void main(String[] args) {


        // Primitive data types are stored in the stack
        int x = 10; // x is stored in the stack
        System.out.println("Primitive data type x: " + x);

        // Objects are stored in the heap
        String str = new String("Hello"); // str is a reference to an object in the heap
        System.out.println("Object str: " + str);
        // Changing the value of x does not affect other variables
        int y = x;
        x = 20;
        System.out.println("x: " + x);
        System.out.println("y: " + y); // y still has the original value of x

        // Changing the object str affects other references to the same object
        String str2 = str;
        str += " World";
        System.out.println("str: " + str);
        System.out.println("str2: " + str2); // str2 also changed because it references the same object

        // Creating a new object does not affect existing references
        String str3 = new String("Hello");
        System.out.println("str3: " + str3); // str3 is a new object, separate from str and str2
    }


}

