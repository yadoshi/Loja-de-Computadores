package entities;

public class Desktop extends Computador{

    private int numPlacaDeVideo;
    private int numSlotsMemoria;
    private String tipoMonitor;
    private String marcaMonitor;
    private int resolucaoMonitor;
    private String marcaPlacaDeVideo;
    private Componentes componentes;

    public Desktop(){}

    public Desktop(int numPlacaDeVideo, int numSlotsMemoria, String tipoMonitor, String marcaMonitor, int resolucaoMonitor, String marcaPlacaDeVideo, Componentes componentes) {
        this.numPlacaDeVideo = numPlacaDeVideo;
        this.numSlotsMemoria = numSlotsMemoria;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
        this.marcaPlacaDeVideo = marcaPlacaDeVideo;
        this.componentes = componentes;
    }

    public Desktop(String marca, Double preco, Integer quantidade, int numPlacaDeVideo, int numSlotsMemoria, String tipoMonitor, String marcaMonitor, int resolucaoMonitor, String marcaPlacaDeVideo, Componentes componentes) {
        super(marca, preco, quantidade);
        this.numPlacaDeVideo = numPlacaDeVideo;
        this.numSlotsMemoria = numSlotsMemoria;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
        this.marcaPlacaDeVideo = marcaPlacaDeVideo;
        this.componentes = componentes;
    }

    public Desktop(double preco, int numPlacaDeVideo, int numSlotsMemoria, String tipoMonitor, String marcaMonitor, int resolucaoMonitor, String marcaPlacaDeVideo, Componentes componentes) {
        super(preco);
        this.numPlacaDeVideo = numPlacaDeVideo;
        this.numSlotsMemoria = numSlotsMemoria;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
        this.marcaPlacaDeVideo = marcaPlacaDeVideo;
        this.componentes = componentes;
    }

    public Desktop(String marca, double preco, int numPlacaDeVideo, int numSlotsMemoria, String tipoMonitor, String marcaMonitor, int resolucaoMonitor, String marcaPlacaDeVideo, Componentes componentes) {
        super(marca, preco);
        this.numPlacaDeVideo = numPlacaDeVideo;
        this.numSlotsMemoria = numSlotsMemoria;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
        this.marcaPlacaDeVideo = marcaPlacaDeVideo;
        this.componentes = componentes;
    }

    public int getNumPlacaDeVideo() {
        return numPlacaDeVideo;
    }

    public void setNumPlacaDeVideo(int numPlacaDeVideo) {
        this.numPlacaDeVideo = numPlacaDeVideo;
    }

    public int getNumSlotsMemoria() {
        return numSlotsMemoria;
    }

    public void setNumSlotsMemoria(int numSlotsMemoria) {
        this.numSlotsMemoria = numSlotsMemoria;
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

    public int getResolucaoMonitor() {
        return resolucaoMonitor;
    }

    public void setResolucaoMonitor(int resolucaoMonitor) {
        this.resolucaoMonitor = resolucaoMonitor;
    }

    public String getMarcaPlacaDeVideo() {
        return marcaPlacaDeVideo;
    }

    public void setMarcaPlacaDeVideo(String marcaPlacaDeVideo) {
        this.marcaPlacaDeVideo = marcaPlacaDeVideo;
    }

    public Componentes getComponentes() {
        return componentes;
    }

    public void setComponentes(Componentes componentes) {
        this.componentes = componentes;
    }

    @Override
    public void imprimir() {
        System.out.println("Desktop:");
        super.imprimir();
        System.out.println("Número de Placas de Vídeo: " + numPlacaDeVideo);
        System.out.println("Número de Slots de Memória: " + numSlotsMemoria);
        System.out.println("Tipo de Monitor: " + tipoMonitor);
        System.out.println("Marca do Monitor: " + marcaMonitor);
        System.out.println("Resolução do Monitor: " + resolucaoMonitor + "p");
        System.out.println("Marca da Placa de Vídeo: " + marcaPlacaDeVideo);
        System.out.println("Componentes:");
        componentes.imprimir();
    }
}
