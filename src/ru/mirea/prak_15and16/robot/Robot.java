package ru.mirea.prak_15and16.robot;

import com.sun.javafx.geom.AreaOp;

public class Robot {
    private String name;
    private int IQ;

    public Robot(String name, int IQ){
        this.name = name;
        this.IQ = IQ;
    }

    public synchronized void RightStep(){
        System.out.println("RightStep");
        IQ += 20;
    }

    public synchronized void LeftStep(){
        System.out.println("LeftStep");
        IQ += 20;
    }

    public int getIQ() {
        return IQ;
    }
}
