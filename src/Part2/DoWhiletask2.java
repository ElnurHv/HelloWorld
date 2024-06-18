package Part2;

public class DoWhiletask2 {
    public static void main(String[] args) {
        int x = 100, y = 30, i = 0;
        do {

            x -= 10;
            y += 10;
            i++;

        } while (x > y);

        System.out.println(i);


    }
}
