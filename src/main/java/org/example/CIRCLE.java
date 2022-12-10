package org.example;

public class CIRCLE {
    private double r;

    public CIRCLE(int r){
        if(r > 0){
            this.r = r;
        }
        else{
            throw new RuntimeException("There is no figure whith such parametrs");
        }
    }

    public double getP(){
        return 2 * 3.14 * r;
    }

    public double getS(){
        return 3.14 * r * r;
    }
}
