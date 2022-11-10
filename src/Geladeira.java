public class Geladeira extends Eletrodomestico {

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimir() {
        System.out.println("O modelo da Geladeira é " + this.modelo  + " E tem a voltagem de " + getVoltagem());
    }
}
