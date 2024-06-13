package animais;

public class animal {
    
    /* private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito; */


    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito; 



    protected void comer(){}

    protected void dormir(){}

    public void soar(){
        System.out.println("cri cri");
    }


    
    /* Construtor */
    public animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }


    





    
}


/* Um atributo especifico do cachorro pode adicionar na classe cachorro, a classe animal é a classe pai e a classe cachorros é a filha e eles herdam todos os atributos do pai */
