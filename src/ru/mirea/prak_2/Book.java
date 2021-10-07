package ru.mirea.prak_2;

public class Book {
    int pages;
    int price;
    String colour;

    public Book(int pages, int price, String colour){
        this.pages = pages;
        this.price = price;
        this.colour = colour;
    }

    public int get_pages(){
        return pages;
    }

    public int get_price(){
        return price;
    }

    public String get_colour(){
        return colour;
    }
}
