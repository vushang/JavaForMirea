package ru.mirea.prak_15and16.bank_system;

import java.util.Random;

public class Account {
    private Person person;
    private int balance = 0;
    Random random = new Random();

    public Account(int value, Person person) {
        this.balance = value;
        this.person = person;

    }

    public synchronized void depositeATM(){
        int sum = 100 + random.nextInt(5001 - 100);
        balance = balance + sum ; // генерация от 100 до 5К
        System.out.println("Пополнение: " + sum + ".");
        getInfoOfBalance();
        System.out.println("Поток " + Thread.currentThread().getName());
    }

    public synchronized void withdrawATM(){
        int sum = 100 + random.nextInt(5001 - 100);

        if(checkBalance(sum)){
            balance = balance - sum;
            System.out.println("Вывод: " + sum + ".");
            getInfoOfBalance();
            System.out.println("Поток " + Thread.currentThread().getName());
        }
        else {
            System.out.println("Недостаточно средств.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean checkBalance(int value){
        if(balance- value < 0)
            return false;
            return true;
    }

    public void getInfoOfBalance(){
        System.out.println("Баланс счета: " + balance);
    }

}
