package Part2;

public class fibonnacibreak {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i <= 30; i++) {
            System.out.println(a);
            if (i == 10) {
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }
    }
}
