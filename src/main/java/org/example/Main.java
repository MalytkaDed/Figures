package org.example;

public class Main {
    public static void main(String[] args) {

        //TRIANGLE
        int a1 = 3, a2 = 4, a3 = 5; //Вводятся стороны треугольника

        Triengle triengle = new Triengle(a1, a2, a3);

        if(!(triengle.real_figure())){
            throw new RuntimeException("There is no figure whith such parametrs");
        }

        System.out.print("\nПериметр треугольника: ");
        System.out.println((triengle.getP()));
        System.out.print("Площадь треугольника: ");
        System.out.println(triengle.getS());


        //CIRCLE
        int r = 4; // Вводится радиус круга

        CIRCLE circle = new CIRCLE(r);

        System.out.print("\nДлина окружности: ");
        System.out.println(circle.getP());
        System.out.print("Площадь круга: ");
        System.out.println(circle.getS());


        //RECTANGLE
        int a = 3, b = 5; // Вводятся стороны прямоугольника

        RECTANGLE rectangle = new RECTANGLE(a, b);

        System.out.print("\nПериметр прямоугольника: ");
        System.out.println((rectangle.getP()));
        System.out.print("Площадь прямоугольника: ");
        System.out.println(rectangle.getS());
    }
}