public class Microondas  extends Eletrodomestico {

    private  String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void imprimir() {
        System.out.println("A cor do Microondas é " + this.cor  + " E tem a voltagem de " + getVoltagem());
    }
}
