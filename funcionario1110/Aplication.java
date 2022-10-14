package funcionario1110;

public class Aplication {
    public static void main(String[] args) {


        Funcionario thamyres = new Funcionario();
        thamyres.setNome("thamyres");
        thamyres.setSalario(1000.0);

        Funcionario joao = new Funcionario();
        joao.setNome("joao");
        joao.setSalario(10000.0);

        thamyres.setSalario(2000.0);
        joao.setSalario(15000.0);


        thamyres.imprimir();
        joao.imprimir();

    }

}