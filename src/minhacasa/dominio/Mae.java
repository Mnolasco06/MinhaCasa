package minhacasa.dominio;

public class Mae extends Pessoa {

    public Mae(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public String titulomae(){
        return "é a mãe";
    }

    public String cozinhar(){
        return "está cozinhando";
    }

    public String afeto(){
        return "é a melhor mãe do mundo";
    }

}
