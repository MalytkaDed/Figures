package org.example;

public class Main {
    public static void main(String[] args) {

        //TRIANGLE
        int a1 = 3, a2 = 4, a3 = 5;

        Triengle triengle = new Triengle(a1, a2, a3);

        if(!(triengle.real_figure())){ //проверяет параметры треугольника
            throw new RuntimeException("There is no figure whith such parametrs");
        }

        System.out.println(triengle.getP());
        System.out.println(triengle.getS());


        //CIRCLE
    }
}