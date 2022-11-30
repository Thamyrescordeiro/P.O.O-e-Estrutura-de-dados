public class Secretario extends Funcionario{

    private String planilha;

    public String getPlanilha() {
        return planilha;
    }

    public void setPlanilha(String planilha) {
        this.planilha = planilha;
    }

    @Override
    public void imprimir() {
        System.out.println("O Secretário " + this.getNome() + " Utiliza a planilha: " + this.getPlanilha() + " Recebe um salário de: " + this.getSalario() + " E tem um custo de: " + this.getCusto());
    }
}
