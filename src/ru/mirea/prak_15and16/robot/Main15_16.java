package ru.mirea.prak_15and16.robot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main15_16 {
    public static void main(String[] args){
        Robot robot = new Robot("baby_terminator", 20);

        Steps step1 = new Steps(robot);
        Steps step2 = new Steps(robot);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(step1);
        service.execute(step2);
        service.shutdown();
    }
}
