public class Eletrodomestico {
    private boolean ligado ;
    private int voltagem;


    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public void ligar(){
     if (this.ligado == true) {
         System.out.printf("Já está ligado");
     }else {
         System.out.printf("Ligando o Eletrodomestico");

     }

    }

    public void desligar(){
        if (this.ligado == true){
            System.out.println("Desligando o Eletrodomestico");
        }else {
            System.out.println("Eletrodomestico Desligado");
        }
    }

    public void imprimir(){

        System.out.println();
    }

    }

