package exercicios;

public class Ex01 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <500 ; i++) {
          // verificar se é impar e se é divisivel por 3!
            if (i % 2 !=0 && i % 3 ==0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
