import animais.animal;
import animais.cachorros;
import animais.gato;
import animais.passaro;
import lojas.petshop;

public class classes {

    public static void main(String[] args) {

        

        /* cachorros cachorro1 = new cachorros(); */

        /* Toda informação que estavamos fazendo 1 por 1 agora o objeto ja esta nascendo com seus atributos, estamos mandando as caracteristicas para o construtor */
        cachorros cachorro1 = new cachorros("Rex", "Marrom", 25, 5.5, "nada", 5 );

        gato gato1 = new gato("Feliz", "Preto", 4.5);

        passaro passaro1 = new passaro("Frajola", "Azul", 0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();



        int inteiro; /* int, long, byte = 0 */
        float $$; /* double e float = 0.0 */
        boolean  $87; /* Boolean tem como default false */
        char ch; /* char é vazio */
        String teste; /* O valor default de qualquer objeto é null */

        double d = 5.5d;
        float f = 3.00f;

        /* Casting - o java não consegue mudar uma coisa para outra mas voce especifica que pode mudar */
        float x = f + (float) d;
        System.out.println(x);


        int a = 23_456_789;


        /* A referencia por mais que esteja apontando para o animal a classe dessa referencia é um gato*/
       /*  animal gato2 = new gato("Feliz", "Preto", 4.5); */

        /* animal animal4 = new ("Feliz", "Preto", 4.5); */




        /* passaro passaro1 = new passaro("Frajola", "Azul", 0.5);

        petshop petshop = new petshop(); */

        /* petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());


        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito()); */
        /* cachorro1.soar();
        gato1.soar();
        passaro1.soar(); */

        /* System.out.println(cachorro1.getNumerosDeCachorros()); */
        
        /* cachorros cachorro2 = new cachorros("Puppy", "Marrom", 25, 5.5, "nada", 5 ); */
        
        /* System.out.println(cachorro2.getNumerosDeCachorros());

        System.out.println(cachorro1.getNumerosDeCachorros()); */






        /* System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString()); */

        
        /* Podemos referencias o mesmo objeto com varias variaveis de referencia diferentes,cuidado, se agente tira uma variavel de um objeto deixando ele sem referencia não encontramos mais ela*/

        /* Garbage Collection - A maquina virtual do java gerencia automaticamente a memoria, recuperando a memoria ocupada por objetos que não estão mais em uso pelo programa, isso evita vazamentos de memória e garante o uso eficiente da memória */

        /* cachorro2 = cachorro1; */

        /* System.out.println("--------------------");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString()); */
        

        /* cachorro1.setNome("Puppy"); 
        cachorro1.setCor("Marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5); */

        /* System.out.println(cachorro1); */

        /* cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar()); */

        /* System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso()); */



        /* System.out.println("O cachorro está " + cachorro1.interagir("carinho"));

        System.out.println("O cachorro está " + cachorro1.interagir("nada"));

        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!")); */
    }

}

/* A classe define como o objeto vai ser, uma definição
O objeto é um objeto
 */

/* Definimos uma classe cachorros, e definiu na memoria um objeto com as informações */


/* Encapsulamento - Voce vai encapsular o seu objeto de forma segura, onde os hackers ou pessoas externas tenham mais dificuldade de acessar, ou pessoas que você nao quer dar acesso pra elas, desta forma voce que vai dar o acesso para elas*/

/* 4 Metodos de Acesso - Public - Liberado para todos, todos podem acessar um metodo ou classe.
Protected - Permite que voce veja os atributos ou metodos se voce acesssar pela mesma classe, pelo mesmo pacote e qualquer filha no mesmo pacote e qualquer classe filha com pacote diferente.
Default - Se não tiver nada ele é default.
Private - So permite acesso da mesma classe*/

/* Debug - Processo para identificar e corrigir erros ou defeitos em um programa de computador atraves dele pode-se identificar os bugs, fazer a correção de erros, a validação do código, a melhoria do desempenho e o aprendizado e entendimento do código */

/* Herança - Atraves da herança podemos construir uma classe animais, colocar todas as caracteristicas de todos os animais, somente caracteristicas que eles possam ter e estender da classe animal a classe animais*/

/* Polimorfismo - é a capacidade de um objeto ser refenreciado de varias formas, o objeto nasce de um tipo e morrre daquele tipo */

/* Classe abstrata - Não pode ter coisas concretas, o animal nao pode virar um objeto, preciso que a classe animal me diga que cada animal vai ter os seus atributos*/

/* Regras Para criação de identificadores, os nomes das variaveis - Deve conter apenas letras, _ , $ , ou numero de 0 a 9, deve obrigatoriamente iniciar por letra, ou _ , ou $ , e uma boa pratica começar com letra minuscula, não pode ter espaço, não pode usar palavra chave do java*/

/* Palavras chaves algumas sao como abstract, assert, boolean, break, btyte, case, catch, char..... não podemos usar para criar variaveis como nome delas */