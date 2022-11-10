import java.util.ArrayList;

public class Aplication {
    public static void main(String[] args) {
        Eletrodomestico eletrodomestico = new Eletrodomestico();
        Fogao fogao = new Fogao();
        Geladeira geladeira = new Geladeira();
        Microondas microondas = new Microondas();
        Televisao televisao = new Televisao();



       fogao.setTipoFogao("Indução");
       fogao.setVoltagem(220);
       fogao.imprimir();



       geladeira.setModelo("Brastemp inox");
       geladeira.setVoltagem(220);
       geladeira.imprimir();


       microondas.setCor("Branco");
       microondas.setVoltagem(220);
       microondas.imprimir();


      televisao.setPolegada("65");
      televisao.setVoltagem(220);
      televisao.imprimir();
      ArrayList<String> canais = new ArrayList<String>();
      canais.add("Tv Globo");
      canais.add("Sbt");



    }
}
