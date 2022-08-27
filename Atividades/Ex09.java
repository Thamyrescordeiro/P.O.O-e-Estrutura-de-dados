package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nomefunc = input.next();
        double salariofixo = input.nextDouble();
        double vendasef = input.nextDouble();
        double comissao = vendasef * 0.15;
        double salariofinal = salariofixo + comissao;

        System.out.printf("TOTAL = %.2f%n" , salariofinal);

    }
}
