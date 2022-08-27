package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Double A = input.nextDouble();
        Double B = input.nextDouble();
        Double C = input.nextDouble();
        Double MEDIA = ((A * 2) + (B * 3) + (C *5)) /10.0;

        System.out.printf("MEDIA = %.1f%n" , MEDIA);
    }
}
