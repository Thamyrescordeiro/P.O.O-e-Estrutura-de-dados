public class Main {
    public static void main(String[] args) {

        Funcionario thamyres = new Funcionario();
        thamyres.setNome("Thamyres Cordeiro");
        thamyres.setSalario(1200.0);
        thamyres.setAumento();
        thamyres.imprimir();

        Funcionario claudia = new Funcionario();
        claudia.setNome("Claudia Barbosa");
        claudia.setSalario(1200.0);
        claudia.setAumento(10);
        claudia.imprimir();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        Gerente lucas = new Gerente();
        lucas.setNome("Lucas Peixoto");
        lucas.setSetor("Fincanceiro");
        lucas.setSalario(20000.0);
        lucas.setAumento();
        lucas.imprimir();

        Gerente paulo = new Gerente();
        paulo.setNome("Paulo Ricardo");
        paulo.setSetor("Marketing");
        paulo.setSalario(20000.0);
        paulo.setAumento(10);
        paulo.imprimir();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        Secretario joao = new Secretario();
        joao.setNome("João Victtor");
        joao.setPlanilha("Excel");
        joao.setSalario(2500.0);
        joao.setAumento();
        joao.imprimir();

        Secretario fernando = new Secretario();
        fernando.setNome("Fernando Silva");
        fernando.setPlanilha("Excel");
        fernando.setSalario(2500.0);
        fernando.setAumento(10);
        fernando.imprimir();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        Programador selton = new Programador();
        selton.setNome("Selton Alves");
        selton.setLinguagemProgramacao("Java");
        selton.setSalario(4500.0);
        selton.setAumento();
        selton.imprimir();

        Programador junior = new Programador();
        junior.setNome("Junior Cardoso");
        junior.setLinguagemProgramacao("Python");
        junior.setSalario(4500.0);
        junior.setAumento(10);
        junior.imprimir();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
    }
}