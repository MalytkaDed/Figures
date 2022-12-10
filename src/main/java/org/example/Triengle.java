package org.example;

public class Triengle {

    //стороны треугольника
    private double a1;
    private double a2;
    private double a3;

    public Triengle(int a1, int a2, int a3){
        if(a1 > 0){this.a1 = a1;}
        if(a2 > 0){this.a2 = a2;}
        if(a3 > 0){this.a3 = a3;}
    }

    public boolean real_figure(){
        if(a1 > (a2+a3) || a2 > (a1+a3) || a3 > (a1+a2)){
            return false;
        }
        else{
            return true;
        }
    }

    //периметр треугольника
    public double getP() {
        return a1 + a2 + a3;
    }

    //площадь треугольника
    public double getS(){
        double p = (a1 + a2 + a3) / 2;
        return Math.sqrt(p * (p - a1) * (p - a2) * (p - a3));
    }
}
