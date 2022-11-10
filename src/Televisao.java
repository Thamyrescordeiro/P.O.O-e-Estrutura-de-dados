public class Televisao extends Eletrodomestico  {

    private String polegada;

    public String getPolegada() {
        return polegada;
    }

    public void setPolegada(String polegada) {
        this.polegada = polegada;
    }

    @Override
    public void imprimir() {
        System.out.println("A televisão tem " + this.polegada + " Polegadas " + " E tem a voltagem de " + getVoltagem());
    }
}
