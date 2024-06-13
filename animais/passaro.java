package animais;


/* Referenciando a classe pai animal com extends */
public class passaro extends animal{

    
    
    static int numeroDePassaros;
    /* private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito; */


    public passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }


    @Override
    public void soar() {
        // TODO Auto-generated method stub
        System.out.println(" PIU PIU");
    }


    /* Construtor */
   /*  public passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDePassaros ++;
    } */


    /* void comer(){}

    void dormir(){}

    void soar(){
        System.out.println("PIU PIU");
    } */

}
