package Part2;

public class WhileTask {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if (i % 2 == 0) {

                sum += i;

            }
            System.out.println(sum);

            i++;
        }


    }
}
