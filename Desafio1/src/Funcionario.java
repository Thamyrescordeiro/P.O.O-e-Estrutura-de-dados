public class Funcionario {
    private String nome;
    private double salario;
    private double custo;
    private double aumento;
    private double percentual;

    private static final double Percentual_Custo = 1.8;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public final void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * Percentual_Custo;
    }

    protected double getPercentual_Custo() {
        return 1.8;
    }

    public class Gerente extends Funcionario {
        protected double getPercentualCusto() {
            return 1.5;
        }
    }

        public double getCusto() {
            return custo;
        }

    public void setAumento(double percentual) {
        double multiplicacao = (100.0+percentual)/100.0;
        this.setSalario(this.getSalario() * multiplicacao);
    }

    public double getAumento() {
        return aumento;
    }
    public void setAumento(){
        this.setAumento(10.0);
    }

    public void imprimir() {
            System.out.println("O Funcionário " + this.getNome() + " Recebe um salário de: " + this.getSalario() + " E tem um custo de: " + this.getCusto());
        }
    }

