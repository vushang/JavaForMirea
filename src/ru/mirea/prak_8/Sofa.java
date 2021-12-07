package ru.mirea.prak_8;

public class Sofa extends Furniture{
    int dimensions;
    String material;
    public Sofa(int dimensions, String material, int price){
        super(price);
        this.dimensions = dimensions;
        this.material = material;
    }

    public void SofaInfo(){
        String newLine = System.getProperty("line.separator");
        System.out.println("dimensions" + dimensions + newLine +
                "price" + price + newLine +
                "material" + material);
    }
}
