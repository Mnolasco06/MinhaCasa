cat <<EOF > README.md
# Projeto: Minha Casa

Este projeto foi desenvolvido como parte do curso de Bootcamp em Java oferecido pela Digital Innovation One em parceria com o Santander. O objetivo do projeto é demonstrar o uso de herança, encapsulamento e métodos.

### Estrutura do Projeto

O projeto está organizado em diferentes classes para representar os membros de uma família e suas interações. Abaixo está a descrição das principais classes e métodos:

#### Classes

1. **Pessoa**
    - Classe abstrata que serve como base para as classes `Pai`, `Mae` e `Filhos`.
    - Contém atributos comuns como `nome`, `sobrenome` e `idade`.

2. **Pai**
    - Extende a classe `Pessoa`.
    - Inclui métodos específicos como `trabalhar` e `assistirtv`.

3. **Mae**
    - Extende a classe `Pessoa`.
    - Inclui métodos específicos como `cozinhar` e `afeto`.

4. **Filhos**
    - Extende a classe `Pessoa`.
    - Inclui métodos específicos como `estudar`, `arrumarquarto` e `assistindodesenho`.
    - Possui um método `listarFilhos` para listar todos os filhos de uma família.

5. **Familia**
    - Classe que gerencia os membros da família, incluindo `Pai`, `Mae` e uma lista de `Filhos`.
    - Métodos para adicionar filhos e obter informações sobre os pais e filhos.

6. **Main**
    - Classe principal para execução do programa.
    - Demonstra a criação de objetos e o uso dos métodos definidos nas outras classes.

### Código de Exemplo

Aqui está um exemplo de como utilizar as classes:

\`\`\`java
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

        // Obtendo o nome de pai e mãe
        System.out.println("Pai: " + familia.getPai().getNome() + " " + familia.getPai().getSobrenome());
        System.out.println("Mãe: " + familia.getMae().getNome() + " " + familia.getMae().getSobrenome());

        // Usando o método estudar
        for (Filhos filho : familia.getFilhos()) {
            System.out.println(filho.estudar());
        }

        // Usando o método listar
        filho1.listarFilhos(familia);

        // Usando os métodos arrumar e assistir desenho
        System.out.println(filho1.getNome() + " " + filho1.arrumarquarto() + " e " + filho2.getNome() + " " + filho2.assistindodesenho() + ".");

        // Usando o método de trabalhar
        System.out.println(pai.getNome() + " " + pai.trabalhar());

        // Usando o método de afeto
        System.out.println(mae.getNome() + " " + mae.afeto());
    }
}
\`\`\`

### Como Executar

1. Certifique-se de ter o JDK instalado em sua máquina.
2. Compile todas as classes Java.
3. Execute a classe `Main` para ver o programa em ação.

### Conclusão

Este projeto serve como um exercício prático para aplicar conceitos de programação orientada a objetos em Java, demonstrando a criação e manipulação de objetos, herança e encapsulamento.

---


