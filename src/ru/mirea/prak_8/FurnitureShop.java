package ru.mirea.prak_8;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    ArrayList<Furniture> Basket = new ArrayList<>();

    private int inputValue(int t) {
        Scanner sc = new Scanner(System.in);
        int value;
        while (true) {
            if (t == 0) {
                value = sc.nextInt();
                if (value != 1 && value != 2) {
                    System.out.println("error");
                    continue;
                }
                break;
            } else if (t == 1) {
                value = sc.nextInt();
                if(value != 1 && value != 2) {
                    System.out.println("error ");
                    continue;
                }
                break;
            }
        }
        return value;
    }

    public FurnitureShop(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - chair, 2 - sofa");

            int value = inputValue(0);

            if (value == 1) {
                System.out.println("1 - small, 2 - big");
                value = inputValue(1);
                switch (value) {
                    case 1:
                        System.out.println("price - 1000");
                        Basket.add(0, new Chair(2000, "plastic", 1000));
                        break;
                    case 2:
                        System.out.println("price - 2000");
                        Basket.add(0, new Chair(3000, "metal", 2000));
                        break;
                    }
            }else if(value == 2){
                System.out.println("1 - small, 2 - big");
                value = inputValue(0);
                switch (value) {
                    case 1:
                        System.out.println("price - 4000");
                        Basket.add(0, new Chair(5000, "wood", 4000));
                        break;
                    case 2:
                        System.out.println("price - 6000");
                        Basket.add(0, new Chair(8000, "wood", 6000));
                        break;
                }
            }

            System.out.println("again? 1 - yes;   2 - no");
            value= inputValue(0);
            if(value == 2)
                break;
        }
    }
    @Override
    public String toString() {
        return "FurnitureShop{" +
                "Basket=" + Basket +
                '}';
    }
}
