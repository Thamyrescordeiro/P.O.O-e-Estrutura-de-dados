package provaPooRpg;

public class Rpg {
    private String nome;
    private int vida = 1000;
    private String tipoPersonagem;

    public Rpg(String nome, String tipoPersonagem) {
        this.nome = nome;
        this.tipoPersonagem = tipoPersonagem;

    }

    public void Pontosvida() {
        if (this.tipoPersonagem == "Arqueiro") {
            this.vida = this.vida + 50;
            {
                System.out.println("voce ganhou 50");
            }
        }
        if (this.tipoPersonagem == "Feiticeiro") {
            this.vida = this.vida + 150;
            {
                System.out.println("voce ganhou 150");
            }
        }
        if (this.tipoPersonagem == "Guerreiro") {
            this.vida = this.vida + 250;
            {
                System.out.println("voce ganhou 250");
            }
        } else {
            System.out.println("Não é possivel ganhar pontos");
        }
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + " Tipo Personagem: " + this.tipoPersonagem + " Vida: " + this.vida);
    }
}

