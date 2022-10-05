public class Conta {
    private String numero;
    private String saldo;
    private String tipo;
    private Agencia agencia;

    private static int qtDeContas = 0;
    public Conta(String numero, String saldo, String tipo, Agencia agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.agencia = agencia;
        qtDeContas ++;
    }

    public static int getQtDeContas() {
        return qtDeContas;
    }
    public  static void imprimirQtDeContas(){
        System.out.println("Esse objeto tem:" + getQtDeContas());
    }

    public void imprimir() {
        System.out.println("o número da conta corrente é:" + this.getNumero());
        System.out.println("O saldo é :" + this.getSaldo());

    }

    public String getNumero() {
        return numero;
    }

    public String getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public Agencia getAgencia() {
        return agencia;
    }
}
