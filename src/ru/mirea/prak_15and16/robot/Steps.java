package ru.mirea.prak_15and16.robot;

public class Steps implements Runnable{
    boolean t = false;
    Robot robot;
    Steps(Robot res){
        this.robot = res;
    }

    private void ChangeTF(){
        if (t == false)
            t = true;
        else
            t = false;
    }

    @Override
    public void run() {
        while (robot.getIQ() < 200){
            if(t)
                robot.RightStep();
            else
                robot.LeftStep();

            ChangeTF();
        }
        System.out.println("TERMINATOR!!!");
    }

}
