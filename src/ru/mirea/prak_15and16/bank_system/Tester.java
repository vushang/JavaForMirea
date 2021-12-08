package ru.mirea.prak_15and16.bank_system;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {
    public static void main(String[] args) {

        Random random = new Random();
        int value = 10000 + random.nextInt(50001 -10000);

        Person stas = new Person("Стас");
        Account account = new Account(value, stas);

        System.out.println(stas.getName() + " на вашему счечу доступно: " + value + ".");

        ATM atm1 = new ATM(account);
        ATM atm2 = new ATM(account);
        ATM atm3 = new ATM(account);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(atm1);
        service.execute(atm2);
        service.execute(atm3);

        service.shutdown();

    }
}
