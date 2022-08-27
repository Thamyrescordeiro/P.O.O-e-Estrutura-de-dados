package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distanciap = input.nextInt();
        double tcombustivel = input.nextDouble();
        double mediacgasto = distanciap / tcombustivel;

        System.out.printf("%.3f km/l%n" , mediacgasto);

    }
}
