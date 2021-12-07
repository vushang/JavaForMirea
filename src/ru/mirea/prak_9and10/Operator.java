package ru.mirea.prak_9and10;

public class Operator implements EmployeePosition {
    private int salary = (int) (Math.random() * 40000);

    public String getJobTitle() {
        return null;
    }

    public double calcSalary() {
        return 0;
    }

    public int getSalary() {
        return salary;
    }
}