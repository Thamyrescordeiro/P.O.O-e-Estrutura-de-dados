package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int nfunci = input.nextInt();
        int nhtrab = input.nextInt();
        double valhora = input.nextDouble();
        double salario = nhtrab * valhora;

        System.out.println("NUMBER = " + nfunci);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
