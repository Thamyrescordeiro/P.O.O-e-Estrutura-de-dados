public class Endereço {
    private String cep;
    private String bairro;
    private String rua;
    private String cidade;
    private String estado;
    private String pais;

    public String getendereçocompleto() {
        String resultado =
                "Cep: " + this.getCep() +
                        " Bairro: " + this.getBairro() +
                        " Rua: " + this.getRua() + "" +
                        " Cidade: " + this.getCidade() +
                        " Estado: " + this.getEstado() +
                        " País: " + this.getPais();
        return resultado;
    }

    public Endereço(String cep, String bairro, String rua, String cidade, String estado, String pais) {
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }
}
