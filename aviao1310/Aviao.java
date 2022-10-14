package aviao1310;

public class Aviao {
    private double peso;
    private int numero;
    private double velocidadeAtual;
    private boolean ligado;

    public Aviao(double peso, int numero, double velocidadeAtual) {
        this.peso = peso;
        this.numero = numero;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("Avião ligado");
        } else {
            this.ligado = true;
            System.out.println("Ligando o Avião");
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Desligando Avião");
        } else {
            System.out.println("O Avião já está desligado");
        }
    }
    public void decolar() {
        if (velocidadeAtual > 0.0){
            System.out.println("Avião decolando");
        }else {
            System.out.println("Avião pousando");
        }
    }
}

