package animais;

/* Referenciando a classe pai animal com extends */
public class cachorros extends animal {

    /*
     * Variavel Estatica - Variavel unica para cada classe nao para cada objeto,
     * indepedente do que o objeto tenha, se quisermos contar o numero de cachorros,
     * podemos deixar uma variavel na classe e todos os objetos que forem
     * construidos a partir dela guardamos dentro dessa variavel
     */
    static int numerosDeCachorros;

    /* Atributos vem logo encima da classe */
    /*
     * private String nome;
     * private String cor;
     * private int altura;
     * private double peso;
     * private String estadoDeEspirito;
     */

    private int tamanhoDoRabo;

    /* Construtores */
    /* Os construtores sao o que executa a construção do seu objeto */
    /*
     * Aqui estamos pedindo para quem for construir o objeto cachorro passar os
     * campos e os atributos para ele construir esses valores
     */
    /* public cachorros(){} */ /* Construtor que cria o objeto mais nao insere nada */

    /* Construtores adicionados para atender uma demanda */
    public cachorros(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numerosDeCachorros++; /* numerosDeCachorros + 1 */
    }

    /*
     * Este metodo esta acessando a variavel nome, e passando pra quem chamou o
     * valor
     */
    /* Metodos */

    public static int getNumerosDeCachorros() {
        return numerosDeCachorros;
    }

    public static void setNumerosDeCachorros(int numerosDeCachorros) {
        cachorros.numerosDeCachorros = numerosDeCachorros;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        /*
         * Por elas terem o mesmo nome nos colocamos o this ele pega a priva String nome
         */
        /* Nao deixamos colocar o nome lilly no set */
        /*
         * if (nome.equals("lilly")) {
         * this.nome = null;
         * }
         */
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    /*
     * Metodo publico, void - nao tem retorno, tem o nome comer, e nao recebe
     * variavel nenhuma e não faz nada
     */

    /*
     * public void comer() {
     * }
     */

    /*
     * public void soar() {
     * System.out.println("AU AU");
     * }
     */

    /* Metodo pegar, para ter um retorno precisamos do return */
    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        /* O switch funciona co private int e enum */
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;

            case "vai dormir!":
                this.estadoDeEspirito = "Bravo";
                break;

            case "pisar na patinha":
                this.estadoDeEspirito = "Triste";
                break;

            default:
                this.estadoDeEspirito = "Neutro";
                break;

        }

        return this.estadoDeEspirito;

    }

    /* Definindo a que o toString está definido */
    /* Override - Pega o metodo do pai daquela classe e altera o resultado dele */
    @Override
    public String toString() {
        return "cachorros [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        // TODO Auto-generated method stub
        System.out.println(" AU AU");
    }

}
/*
 * if (acao.equals("carinho")) {
 * this.estadoDeEspirito = "Feliz";
 * }
 * else if (acao.equals("vai dormir")) {
 * this.estadoDeEspirito = "Bravo";
 * }
 * else if (acao.equals("pisar na patinha")) {
 * this.estadoDeEspirito = "Triste";
 * }
 * else {
 * this.estadoDeEspirito = "Neutro";
 * }
 * 
 * return estadoDeEspirito;
 */

/*
 * Equals - Compara as strings, entao se manda uma string x ele vai compara se
 * bate com esse metodo,
 */

/* Este atributo estadoDeEspirito está recebendo feliz */