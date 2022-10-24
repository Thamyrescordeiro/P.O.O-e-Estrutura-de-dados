package provaPooContaCorrente;

public class contaCorrente {

    private int numero ;
    private double saldo;

    public contaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    private static double valor_de_entrada = 1550.0;

    public void creditar(){
        this.saldo = saldo + valor_de_entrada;
        System.out.println(this.getSaldo());
    }
    public void debitar(){
        if (this.saldo > valor_de_entrada){
            this.saldo = saldo - valor_de_entrada;
            System.out.println(this.getSaldo());
        }else {
            System.out.println("Vocẽ não tem saldo suficiente para debitar o valor " + valor_de_entrada);
        }
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public static double getValor_de_entrada(){
        return valor_de_entrada;
    }
    public void imprimir(){
        System.out.println("O número da conta é: " + this.getNumero() + " e seu saldo é de: " + this.getSaldo());
    }
}
