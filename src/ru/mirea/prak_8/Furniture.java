package ru.mirea.prak_8;

public abstract class Furniture {
    int price;

    public Furniture(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                '}';
    }
}
