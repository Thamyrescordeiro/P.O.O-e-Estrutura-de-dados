package exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, n;
        System.out.println("Digite um valor de 1 a 10:");
        n = entrada.nextInt();
        System.out.println();
        for (i=1; i<=10; i++){
            System.out.printf("N x %d = %d%n" ,i , (n*i));
        }
    }
}
