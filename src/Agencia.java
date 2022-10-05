public class Agencia {
    private String numero;
    private Endereço endereço;

    public Agencia(String numero, Endereço endereço) {
        this.numero = numero;
        this.endereço = endereço;
    }

    public void imprimir() {
        System.out.println("A agência está localizada em " + this.endereço.getendereçocompleto());
        System.out.println("O número da agência é " + this.getNumero());
    }

    public String getNumero() {
        return numero;
    }

    public Endereço getEndereço() {
        return endereço;
    }
}

