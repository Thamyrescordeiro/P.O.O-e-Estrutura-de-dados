public class Gerente extends Funcionario{

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void imprimir() {
        System.out.println("O Gerente " + this.getNome() + " Trabalha no setor de: "+ this.getSetor() + " Recebe um salário de: " + this.getSalario() + " E tem um custo de: " + this.getCusto());
    }
}
