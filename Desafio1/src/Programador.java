public class Programador extends Funcionario{

    private String linguagemProgramacao;

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    @Override
    public void imprimir() {
        System.out.println("O Programador " + this.getNome() + " Utiliza a Linguagem:" + this.getLinguagemProgramacao() + " Recebe um salário de: " + this.getSalario() + " E tem um custo de: " + this.getCusto());
    }
}
