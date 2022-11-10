public class Fogao extends Eletrodomestico {

    private String TipoFogao;

    public String getTipoFogao() {
        return TipoFogao;
    }

    public void setTipoFogao(String tipoFogao) {
        TipoFogao = tipoFogao;
    }

    @Override
    public void imprimir() {
        System.out.println("O tipo do Fogão é " + this.TipoFogao  + " E tem a voltagem de " + getVoltagem());
    }
}
