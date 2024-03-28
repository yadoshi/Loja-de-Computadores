package entities;

public class Notebook extends Computador{

    private int slotsMemoria;
    private int resolucaoMonitor;

    private String tipoMonitor;

    private String marcaMonitor;

    private Componentes componentes;

    public Notebook(){}

    public Notebook(int slotsMemoria, int resolucaoMonitor, String tipoMonitor, String marcaMonitor) {
        this.slotsMemoria = slotsMemoria;
        this.resolucaoMonitor = resolucaoMonitor;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
    }

    public Notebook(String marca, Double preco, Integer quantidade, int slotsMemoria, int resolucaoMonitor, String tipoMonitor, String marcaMonitor, Componentes componentes) {
        super(marca, preco, quantidade);
        this.slotsMemoria = slotsMemoria;
        this.resolucaoMonitor = resolucaoMonitor;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.componentes = componentes;
    }

    public Notebook(double preco, int slotsMemoria, int resolucaoMonitor, String tipoMonitor, String marcaMonitor) {
        super(preco);
        this.slotsMemoria = slotsMemoria;
        this.resolucaoMonitor = resolucaoMonitor;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
    }

    public Notebook(String marca, double preco, int slotsMemoria, int resolucaoMonitor, String tipoMonitor, String marcaMonitor) {
        super(marca, preco);
        this.slotsMemoria = slotsMemoria;
        this.resolucaoMonitor = resolucaoMonitor;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
    }

    public int getSlotsMemoria() {
        return slotsMemoria;
    }

    public void setSlotsMemoria(int slotsMemoria) {
        this.slotsMemoria = slotsMemoria;
    }

    public int getResolucaoMonitor() {
        return resolucaoMonitor;
    }

    public void setResolucaoMonitor(int resolucaoMonitor) {
        this.resolucaoMonitor = resolucaoMonitor;
    }

    public String getTipoMonitor() {
        return tipoMonitor;
    }

    public void setTipoMonitor(String tipoMonitor) {
        this.tipoMonitor = tipoMonitor;
    }

    public String getMarcaMonitor() {
        return marcaMonitor;
    }

    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }

    public Componentes getComponentes() {
        return componentes;
    }

    public void setComponentes(Componentes componentes) {
        this.componentes = componentes;
    }

    @Override
    public void imprimir() {
        System.out.println("Notebook: ");
        super.imprimir();
        System.out.println("Slots de Memória: " + slotsMemoria);
        System.out.println("Resolução do Monitor: " + resolucaoMonitor + "p");
        System.out.println("Tipo de Monitor: " + tipoMonitor);
        System.out.println("Marca do Monitor: " + marcaMonitor);
        System.out.println("Componentes:");

        componentes.imprimir();
    }
}
