package pl.sda.javastart2.enums.concurrency;

public class Bank {
    private static int balance=1000;

    private static int operations;
    public static void withdraw(int howMuch){
        balance=balance=howMuch;
        System.out.println(Thread.currentThread().getName()+"Stan konta po wypłacie: "+balance);

    }
    public static void giveBack(int howMuch){
        balance=balance+howMuch;
        System.out.println(Thread.currentThread().getName()+"Stan konta po wpłacie: "+balance);
    operations++;
    }
}
