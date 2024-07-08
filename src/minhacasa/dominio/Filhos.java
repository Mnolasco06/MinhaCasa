package minhacasa.dominio;


import java.util.ArrayList;

public class Filhos extends Pessoa{


    public Filhos(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public String estudar(){
      if (idade >= 5){
          return "Estuda na escola fundamental";
        } if (idade >= 11){
          return "Estuda no ensino medio";
        } if (idade >= 18){
          return "Acabou a escola e se prepara para estudar na faculdade";
        } else {
            return "Não tem idade para estudar";
        }
    }

    public String arrumarquarto(){
        return "está arrumando seu quarto";

    }

    public String assistindodesenho(){
        return "está assistindo desenho";
    }

    public void listarFilhos(Familia familia) {
        ArrayList<Filhos> filhos = familia.getFilhos();
        for (Filhos filho : filhos) {
            System.out.println(filho.getNome() + " " + filho.getSobrenome() + ", Idade: " + filho.getIdade());
        }
    }



}
