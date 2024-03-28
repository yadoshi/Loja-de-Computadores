package entities;

public class Servidor extends Computador{

    private int numeroHd;
    private int slotsMemoria;
    private int capacidadeMemoria;
    private String tipoGabinete;

    private String marcaGabinete;

    private Componentes componentes;


    public Servidor(){
    }

    public Servidor(String marca, double preco, int quantidade) {
        super(marca,preco,quantidade);
    }

    public Servidor(String marca, double preco, int numeroHD, int slotsMemoria,
                    int capacidadeMemoria, String tipoGabinete, String marcaGabinete, Componentes componentes) {
        super(marca, preco);
        this.numeroHd = numeroHD;
        this.slotsMemoria = slotsMemoria;
        this.capacidadeMemoria = capacidadeMemoria;
        this.tipoGabinete = tipoGabinete;
        this.marcaGabinete = marcaGabinete;
        this.componentes = componentes;
    }

    // Construtor com todos os atributos, exceto marca e quantidade
    public Servidor(double preco, int numeroHD, int slotsMemoria, int capacidadeMemoria,
                    String tipoGabinete, String marcaGabinete, Componentes componentes) {
        super(preco);
        this.numeroHd = numeroHD;
        this.slotsMemoria = slotsMemoria;
        this.capacidadeMemoria = capacidadeMemoria;
        this.tipoGabinete = tipoGabinete;
        this.marcaGabinete = marcaGabinete;
        this.componentes = componentes;
    }

    public Servidor(String marca, Double preco, Integer quantidade, Integer numeroHd, Integer slotsMemoria,
                    Integer capacidadeMemoria, String tipoGabinete, String marcaGabinete, Componentes componentes) {
        super(marca, preco, quantidade);
        this.numeroHd = numeroHd;
        this.slotsMemoria = slotsMemoria;
        this.capacidadeMemoria = capacidadeMemoria;
        this.tipoGabinete = tipoGabinete;
        this.marcaGabinete = marcaGabinete;
        this.componentes = componentes;
    }

    public Integer getNumeroHd() {
        return numeroHd;
    }

    public void setNumeroHd(Integer numeroHd) {
        this.numeroHd = numeroHd;
    }

    public Integer getSlotsMemoria() {
        return slotsMemoria;
    }

    public void setSlotsMemoria(Integer slotsMemoria) {
        this.slotsMemoria = slotsMemoria;
    }

    public Integer getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(Integer capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }


    public String getMarcaGabinete() {
        return marcaGabinete;
    }

    public void setMarcaGabinete(String marcaGabinete) {
        this.marcaGabinete = marcaGabinete;
    }

    public Componentes getComponentes() {
        return componentes;
    }

    public void setComponentes(Componentes componentes) {
        this.componentes = componentes;
    }

    @Override
    public void imprimir(){
        System.out.println("Servidor: ");
        super.imprimir();
        System.out.println("Número de HDs: " + numeroHd);
        System.out.println("Slots de Memória: " + slotsMemoria);
        System.out.println("Capacidade de Memória: " + capacidadeMemoria + "Gb");
        System.out.println("Tipo de Gabinete: " + tipoGabinete);
        System.out.println("Marca de Gabinete: " + marcaGabinete);
        System.out.println("Componentes:");

        componentes.imprimir();
    }
}
