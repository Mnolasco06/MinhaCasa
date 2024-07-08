package minhacasa.dominio;

public class Pai extends Pessoa {


    public Pai(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public String titulopai(){
        return "é o pai";
    }

    public String trabalhar(){
        return "está trablhando";
    }

    public String assistirtv(){
        return "está assistindo o jogo";
    }


}
