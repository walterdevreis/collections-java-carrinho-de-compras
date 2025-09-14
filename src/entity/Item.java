package entity;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(){}

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString(){
        return "Nome: "
        + getNome()
        + "\n"
        + "Preço: "
        + String.format("%.2f", getPreco())
        + "\n"
        + "Quantidade: "
        + getQuantidade();
    }
}
