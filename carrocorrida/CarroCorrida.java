package carrocorrida;
/* obs: não pode ultrapassar a velomax
frear e acelerar só se estiver ligado
só desligar se estiver parado
se ligado e tentar ligar de novo: "o carro já esta ligado"
se desligado e tentar desligar : " o carro ja esta desligado"
 */

public class CarroCorrida {

    private int numeroCarro;
    private String piloto;
    private double velocidadeMax;
    private double velocidadeMin;
    private boolean ligado; /* ja inicia como false */
    private double velocidadeAtual; /* inicia com o valor 0 */

    public CarroCorrida(int numeroCarro, String piloto, double velocidadeMax) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMax = velocidadeMax;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado");
        } else {
            this.ligado = true;
            System.out.println("Ligando o carro");
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Desligamos o carro");
        } else {
            System.out.println("O carro já está desligado");
        }
    }

    public void acelerar(double valorAceleracao) {
        if (this.ligado) {
            if (this.velocidadeMax < this.velocidadeAtual + valorAceleracao) {
                System.out.println("Você não pode ultrapassar a velocidade Máxima");
            } else {
                this.velocidadeAtual += valorAceleracao;
                System.out.println("O carro está " + this.velocidadeAtual + "Km/h");
            }
        } else {
            System.out.println("Você não pode acelerar o carro desligado");
        }
    }

    public void frear(double valorFreio) {
        if (this.ligado) {
         if (this.velocidadeMin >= this.velocidadeAtual - valorFreio) {
         this.velocidadeAtual -= valorFreio;
         if (this.velocidadeAtual == 0.0) {
                    System.out.println("O carro parou");
                } else {
                    System.out.println("O carro está " + velocidadeAtual + "Km/h");
                }
            } else {
                this.velocidadeAtual = 0;
                System.out.println("O carro parou");
            }
        }else {
            System.out.println("Você não pode frear o carro desligado");
        }
    }
    public  void parar(){
        if (this.ligado){
            if (this.velocidadeAtual >0){
                this.velocidadeAtual =0;
                System.out.println("O carro parou");
            }else {
                System.out.println("O carro já está parado");
            }

        }else {
            System.out.println("O carro está desligado e parado");
    }
    }
}
