public class Noticia {

    public static void imprimir(){
        System.out.println("Os torcedores voltaram a se reunir em várias cidades do Brasil nesta segunda-feira (28) para acompanhar o segundo jogo da seleção brasileira na Copa do Catar, contra a Suíça. ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void imprimir(String cabecalho){
        System.out.println("Brasil x Suíça: torcedores se reúnem para assistir ao 2º jogo da seleção brasileira na Copa do Catar\n\n Os torcedores voltaram a se reunir em várias cidades do Brasil nesta segunda-feira (28) para acompanhar o segundo jogo da seleção brasileira na Copa do Catar, contra a Suíça. ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void imprimir(String texto,String rodape) {
        System.out.println("Os torcedores voltaram a se reunir em várias cidades do Brasil nesta segunda-feira \n\n © Copyright 2000-2022 Globo Comunicação e Participações S.A.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void imprimir(String cabecalho,String texto,String rodape){
        System.out.println("Brasil x Suíça: torcedores se reúnem para assistir ao 2º jogo da seleção brasileira na Copa do Catar\nOs torcedores voltaram a se reunir em várias cidades do Brasil nesta segunda-feira \n\n © Copyright 2000-2022 Globo Comunicação e Participações S.A.");

    }
}
