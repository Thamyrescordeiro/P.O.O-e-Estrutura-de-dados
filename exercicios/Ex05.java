package exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite números (0 sai): ");

        int soma= 0;
        int quant= 0;
        int par = 0;
        int impar= 0;

        while (true){
            int numero = Integer.parseInt(imput.nextLine());

            if (numero == 0) {
                break;
            } else if(numero%2==0){
                par++;
            } else{
                impar++;
            }

            soma = soma + numero;
            quant++;
        }
        double media= soma/(quant*1.0);

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);


    }
}
