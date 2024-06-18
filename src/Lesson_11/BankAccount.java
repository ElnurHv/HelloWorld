package Lesson_11;

public class BankAccount {
    static int totalaccount = 0;
    String name;
    int password;
    int money;


    public BankAccount(String name, int password, int money) {
        this.name = name;
        this.password = password;
        this.money = money;
        totalaccount++;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", money=" + money +
                '}';
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Elnur", 12345, 500);
        BankAccount account1 = new BankAccount("Vaqif", 54321, 200);
        System.out.println(account);
        System.out.println(account1);
        System.out.println(BankAccount.totalaccount);

    }

}