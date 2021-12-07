package ru.mirea.prak_9and10;

import java.util.Comparator;
public class ComparatorSalary implements Comparator<Employee>{

    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
