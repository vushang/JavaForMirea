package ru.mirea.prak_9and10;

import java.util.List;

public class Main9_10 {
    public static void main(String[] args) {
        Company mirea = new Company();
        mirea.hireAll(180, "Operator");
        mirea.hireAll(80, "Manager");
        mirea.hireAll(10, "TopManager");

        System.out.printf("start\n", mirea.getIncome());
        getList(mirea.getTopSalaryStaff(10));
        getList(mirea.getLowestSalaryStaff(30));
        mirea.fire(0.6);

        System.out.printf("kick \n");

        getList(mirea.getTopSalaryStaff(10));
        getList(mirea.getLowestSalaryStaff(30));

        System.out.printf("after", mirea.getIncome());
    }

    public static void getList(List<Employee> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            System.out.println(i + 1 + "-" + list.get(i).getSalary());
        }
    }
}
