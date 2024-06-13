package animais;


/* Referenciando a classe pai animal com extends */
public class gato extends animal {


    static int numeroDeGatos;


    /* Cria um construtor que bate com o pai */
    public gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
        //TODO Auto-generated constructor stub
    }







    


    /* private String nome;
    private String cor;
    private String altura;
    private double peso;
    private String estadoEspirito; */



    /* Construtor */
   /*  public gato(String nome, String cor, String altura, double peso, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;

        numeroDeGatos ++;
    } */


    /* Metodos */
    /* void comer(){}

    void dormir(){}

    void soar(){
        System.out.println("MIAU MIAU");
    } */


    @Override
    public String toString() {
        return "gato [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        // TODO Auto-generated method stub
        System.out.println(" MIAU MIAU");
    }
    
}
