package animais;


/* Abstract -  Não pode criar um objeto a partir dela so estende-la */
public abstract class animal {
    
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

    /* Todo abstract não tem corpo {} */
    public abstract void soar();


    
    /* Construtor */
    public animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }


    





    
}


/* Um atributo especifico do cachorro pode adicionar na classe cachorro, a classe animal é a classe pai e a classe cachorros é a filha e eles herdam todos os atributos do pai */
