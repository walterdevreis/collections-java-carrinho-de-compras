import entity.CarrinhoDeCompras;
import entity.Item;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.print("Entre com a quandidade de itens: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Entre com os dados do " + (i+1) + " item: ");
            scanner.nextLine();
            System.out.print("Entre com o nome do item: ");
            String nome = scanner.nextLine();
            System.out.print("Entre com o preço do item: ");
            double preco = scanner.nextDouble();
            System.out.print("Entre com a quantidade do item: ");
            int quantidade = scanner.nextInt();

            carrinhoDeCompras.adicionarItem(new Item(nome, preco, quantidade));
        }
        carrinhoDeCompras.exibirItens();

        System.out.println();

        System.out.print("Digite o nome do item para remoção: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        carrinhoDeCompras.removerItem(nome);
        carrinhoDeCompras.exibirItens();

        System.out.println();

        double valorTotaldoCarrinho = carrinhoDeCompras.calcularValorTotal();

        System.out.println("Valor total do carrinho de compra: " + valorTotaldoCarrinho);

        scanner.close();
    }
}