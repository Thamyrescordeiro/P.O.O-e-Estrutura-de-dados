package carrocorrida;

public class Aplication {

    public static void main(String[] args) {

        CarroCorrida mercedes = new CarroCorrida(85,"joao",100);

        mercedes.ligar();
        mercedes.acelerar(20);
        mercedes.acelerar(120);
        mercedes.frear(10);
    }
}
