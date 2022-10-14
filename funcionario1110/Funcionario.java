package funcionario1110;

public class Funcionario {
    private String nome;
    private double salario;
    private  double custo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario*1.8;
    }

    public double getCusto() {
        return custo;
    }

    public void imprimir(){
        System.out.println(this.getNome() + " ganha " + this.getSalario() + " e tem um custo de " + this.getCusto());

    }


}
