package entities;

public class Componentes {

    private String tipoMemoria;
    private String marcaMemoria;
    private String tipoHd;
    private String marcaHd;
    private int capacidadeHd;
    private String tipoFonte;
    private String marcaFonte;
    private int potenciaFonte;

    public Componentes(){}

    public Componentes(String tipoMemoria, String tipoHd, int capacidadeHd, String tipoFonte, int potenciaFonte){
        this.tipoMemoria = tipoMemoria;
        this.tipoHd = tipoHd;
        this.capacidadeHd = capacidadeHd;
        this.tipoFonte = tipoFonte;
        this.potenciaFonte = potenciaFonte;
    }

    public Componentes(String tipoMemoria, String marcaMemoria, String tipoHd, String marcaHd, int capacidadeHd, String tipoFonte, String marcaFonte, Integer potenciaFonte) {
        this.tipoMemoria = tipoMemoria;
        this.marcaMemoria = marcaMemoria;
        this.tipoHd = tipoHd;
        this.marcaHd = marcaHd;
        this.capacidadeHd = capacidadeHd;
        this.tipoFonte = tipoFonte;
        this.marcaFonte = marcaFonte;
        this.potenciaFonte = potenciaFonte;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String getMarcaMemoria() {
        return marcaMemoria;
    }

    public void setMarcaMemoria(String marcaMemoria) {
        this.marcaMemoria = marcaMemoria;
    }

    public String getTipoHd() {
        return tipoHd;
    }

    public void setTipoHd(String tipoHd) {
        this.tipoHd = tipoHd;
    }

    public String getMarcaHd() {
        return marcaHd;
    }

    public void setMarcaHd(String marcaHd) {
        this.marcaHd = marcaHd;
    }

    public Integer getCapacidadeHd() {
        return capacidadeHd;
    }

    public void setCapacidadeHd(Integer capacidadeHd) {
        this.capacidadeHd = capacidadeHd;
    }

    public String getTipoFonte() {
        return tipoFonte;
    }

    public void setTipoFonte(String tipoFonte) {
        this.tipoFonte = tipoFonte;
    }

    public String getMarcaFonte() {
        return marcaFonte;
    }

    public void setMarcaFonte(String marcaFonte) {
        this.marcaFonte = marcaFonte;
    }

    public Integer getPotenciaFonte() {
        return potenciaFonte;
    }

    public void setPotenciaFonte(Integer potenciaFonte) {
        this.potenciaFonte = potenciaFonte;
    }

    public void imprimir(){
        System.out.println("Tipo de Memória: " + tipoMemoria);
        System.out.println("Marca de Memória: " + marcaMemoria);
        System.out.println("Tipo de HD: " + tipoHd);
        System.out.println("Marca de HD: " + marcaHd);
        System.out.println("Capacidade de HD: " + capacidadeHd + "Gb");
        System.out.println("Tipo de Fonte: " + tipoFonte);
        System.out.println("Marca de Fonte: " + marcaFonte);
        System.out.println("Potência de Fonte: " + potenciaFonte + "W");
    }
}
