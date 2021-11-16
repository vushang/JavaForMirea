package ru.mirea.prak_7;

import java.util.ArrayList;

public class Main7 {
    public static void main(String[] args){
        ////dish
        Plate plate = new Plate(1,10);

        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();

        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);

        ////dog
        babaska dog1 = new babaska(10, "krasiviy", "dlinniy");
        dog1.babaska_milaya();
        sobaka_ylibaka dog2 = new sobaka_ylibaka(6, "toje_krasivy", "korotky");
        dog2.sobaka_ylibaetsa();
    }
}
