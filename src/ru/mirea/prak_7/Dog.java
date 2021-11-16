package ru.mirea.prak_7;

public abstract class Dog {
    protected int age;
    protected String color;
    protected String sherst;
    public Dog(int age, String color, String sherst) {
        this.age = age;
        this.color = color;
        this.sherst = sherst;
    }

    public void sobaka_ylibaetsa(){
        System.out.println("god_boy!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", sherst='" + sherst + '\'' +
                '}';
    }
}
