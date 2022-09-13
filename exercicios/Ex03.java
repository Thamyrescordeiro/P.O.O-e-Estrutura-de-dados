package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite os valores:");
        int Positivo = 0;
        int Negativo = 0;
        int Qtn = 0;
        int soma = 0;
        int numero;
        int Med1;
        while (true) {
            numero = entrada.nextInt();
            if (numero == 0) break;
            else if (numero > 0) {
                Positivo++;
            } else {
                Negativo++;
            }
            Qtn++;
            soma = soma + numero;
        }
        Med1 = soma / Qtn;
        double porcPositivo = (double) Positivo / Qtn * 100;
        double porcnegativo = (double) Negativo / Qtn* 100;
        System.out.println("Média: " + Med1);
        System.out.println("Números totais: " + Qtn);
        System.out.println("Positivos: " + Positivo);
        System.out.println("Negativos: " + Negativo);
        System.out.println("Porcentagem Positivos: " + porcPositivo);
        System.out.println("Porcentagem Negativos: " + porcnegativo);
    }
}
