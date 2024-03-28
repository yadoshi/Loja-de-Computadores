package entities;

public class Computador {

    String marca;
    double preco;
    int quantidade;

    public Computador(){}

    public Computador(String marca, Double preco, Integer quantidade) {
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Computador(double preco) {
    }

    public Computador(String marca, double preco) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
