package entity;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeItens;

    public CarrinhoDeCompras(){
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        listaDeItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : listaDeItens){
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        listaDeItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item item : listaDeItens){
            valorTotal += item.getQuantidade() * item.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens(){
        for (Item item : listaDeItens){
            System.out.println(item);
        }
    }
}
