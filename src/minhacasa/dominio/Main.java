package minhacasa.dominio;

public class Main {

    public static void main(String[] args) {

         Pai pai = new Pai("Carlos", "Silva", 40) {
             {
                 setNome("Carlos");
                 setSobrenome("Silva");
                 setIdade(40);
             }
         };

        Mae mae = new Mae("Maria", "Dolores", 39) {
            {
                setNome("Mariana");
                setSobrenome("Silva");
                setIdade(38);
            }
        };


        Familia familia = new Familia(pai, mae);


        Filhos filho1 = new Filhos("Davi", "Nolasco", 1);
        Filhos filho2 = new Filhos("Ana", "Silva", 6);

        familia.adicionarFilho(filho1);
        familia.adicionarFilho(filho2);

        // obtendo o nome de pai e mae
        System.out.println("Pai: " + familia.getPai().getNome() + " " + familia.getPai().getSobrenome());
        System.out.println("Mae: " + familia.getMae().getNome() + " " + familia.getMae().getSobrenome());

        // usando o metodo estudar
        for (Filhos filho : familia.getFilhos()) {
            System.out.println(filho.estudar());
        }

        // usando o metodo listar
        filho1.listarFilhos(familia);

        // usando o metodo arrumar e assistir desenho
        System.out.println(filho1.getNome() + " " + filho1.arrumarquarto() + " e " + filho2.getNome() + " " + filho2.assistindodesenho() + ".");

        // usando o metodo de trabalhar
        System.out.println(pai.getNome() + " " + pai.trabalhar());


        // usando o metodo de afeto
        System.out.println(mae.getNome() + " " + mae.afeto());

    }

}
