package aviao1310;

public class Aplication {
    public static void main(String[] args) {

        Aviao latam = new Aviao(50.0, 585, 0);

        latam.ligar();
        latam.decolar();
        latam.desligar();

    }
}
