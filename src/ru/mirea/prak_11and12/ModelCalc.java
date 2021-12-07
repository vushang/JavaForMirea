package ru.mirea.prak_11and12;

public class ModelCalc {
    public double calc(double x, double y, String operation){
        switch(operation){
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                if((x == 0 && y < 0)|(y == 0 && x < 0)) return Math.abs(x * y);
                else return x * y;
            case "/":
                if(y == 0) return 0;
                else return Math.ceil((x / y) * Math.pow(10, 3)) / Math.pow(10, 3);
            default:
                System.out.println("No operation" + operation);
                return 0;

        }
    }
    public String MatExample(String x, String y, String operation){
        return (x + operation + y);
    }
}
