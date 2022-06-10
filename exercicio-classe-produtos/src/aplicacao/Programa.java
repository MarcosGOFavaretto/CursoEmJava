package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Produto produtos = new Produto();
		Scanner sc = new Scanner(System.in);

		System.out.println("Preencha as informa��es do produto:");
		System.out.print("Nome: ");
		produtos.nome = sc.nextLine();
		System.out.print("Pre�o: ");
		produtos.preco = sc.nextDouble();
		System.out.print("Quantidade no Estoque: ");
		produtos.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println(produtos);
		System.out.println();

		System.out.print("Informe qual ser� a quantidade adicionada ao estoque: ");
		produtos.adicionarProdutos(sc.nextInt());
		
		System.out.println("O Produto foi atualizado!");
		System.out.println();
		System.out.println(produtos);
		System.out.println();
		
		System.out.print("Informe qual ser� a quantidade retirada do estoque: ");
		produtos.removerProdutos(sc.nextInt());
		
		System.out.println("O Produto foi atualizado!");
		System.out.println();
		System.out.println(produtos);
		System.out.println();

		sc.close();
	}
}
