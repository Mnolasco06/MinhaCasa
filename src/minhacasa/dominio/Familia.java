package minhacasa.dominio;

import java.util.ArrayList;

public class Familia {


    private Pessoa pai;
    private Pessoa mae;
    private ArrayList<Filhos> filhos;

    public Familia(Pessoa pai, Pessoa mae) {
        this.pai = pai;
        this.mae = mae;
        this.filhos = new ArrayList<>();
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void adicionarFilho(Filhos filho) {
        this.filhos.add(filho);
    }

    public ArrayList<Filhos> getFilhos() {
        return filhos;
    }
}
