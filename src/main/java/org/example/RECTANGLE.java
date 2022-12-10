package org.example;

public class RECTANGLE {
    private double a;
    private double b;

    public RECTANGLE(double a, double b){
        if(a > 0){
            this.a = a;
        }
        else{
            throw new RuntimeException("There is no figure whith such parametrs");
        }

        if(b > 0){
            this.b = b;
        }
        else{
            throw new RuntimeException("There is no figure whith such parametrs");
        }
    }

    public double getP(){
        return 2 * (a + b);
    }

    public double getS(){
        return a * b;
    }
}
