package ru.mirea.prak_3.nomer3_2;

public class Human_test {
    public static void main(String[] args) {
        Human Oleg = new Human("Oleg", 19);
        Oleg.get_info_all();
        System.out.println(Oleg.get_age());
        System.out.println(Oleg.get_name());
    }
}