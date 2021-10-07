package ru.mirea.prak_3.nomer3_2;

public class Human {
    String name;
    int age;
    Head head_1 = new Head();
    Hand hand_1 = new Hand();
    Leg leg_1 = new Leg();

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void get_info_all(){
        this.head_1.get_info_head();
        this.hand_1.get_info_hand();
        this.leg_1.get_info_leg();
    }

}
