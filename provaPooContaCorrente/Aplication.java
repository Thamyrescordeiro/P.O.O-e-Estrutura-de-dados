package provaPooContaCorrente;

public class Aplication {
    public static void main(String[] args) {


        contaCorrente contacorrente = new contaCorrente(70789 - 8, 2.0);

        contacorrente.imprimir();
        contacorrente.debitar();
        contacorrente.creditar();
    }
}
