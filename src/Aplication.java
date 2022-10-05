public class Aplication {
    public static void main(String[] args) {
        Endereço endereço = new Endereço(
                "53530-468",
                "Caétes 1",
                "186",
                "Abreu e lima",
                "Pernambuco",
                "Brasil"
        );

        Agencia agencia = new Agencia("4564782-1", endereço);
        Conta conta = new Conta(
                "1456456456",
                "23111",
                "corrente",
                agencia

        );
        Cliente cliente = new Cliente(
                "326548645-45",
                "thamyres",
                conta
        );
        Cliente.imprimirInfoCliente();
        Conta.imprimirQtDeContas();
    }

    }


