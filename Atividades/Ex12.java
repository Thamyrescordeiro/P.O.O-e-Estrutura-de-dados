package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double PI = 3.14159;
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double areatriangretang = (A * C) / 2.0;
        double areacirc = PI * Math.pow(C,2);
        double areatrap = ((A + B)* C) / 2;
        double areaquad = B * B ;
        double arearetang = A * B ;

        System.out.printf("TRIANGULO: %.3f%n" , areatriangretang);
        System.out.printf("CIRCULO: %.3f%n" , areacirc);
        System.out.printf("TRAPEZIO: %.3f%n" ,  areatrap);
        System.out.printf("QUADRADO: %.3f%n" , areaquad);
        System.out.printf("RETANGULO: %.3f%n" ,  arearetang);
    }
}
