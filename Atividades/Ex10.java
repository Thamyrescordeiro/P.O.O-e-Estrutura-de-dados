package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codpec1 = input.nextInt();
        int quantpec1 = input.nextInt();
        double valpec1 = input.nextDouble();

        int codpec2 = input.nextInt();
        int quantpec2 = input.nextInt();
        double valpec2 = input.nextDouble();

        double total = quantpec1 * valpec1 + quantpec2 * valpec2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n" , total);

    }
}
