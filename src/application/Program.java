package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do Produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		
		Product product = new Product(nome, preco);
		
		System.out.println("Informe o nome do novo produto: ");
		nome = sc.next();
		product.setNome(nome);
		System.out.println("Informe o valor do preço do produto: ");
		preco = sc.nextDouble();
		product.setpreco(preco);
		System.out.println("Atualização de Produto: " + product.getNome());
		System.out.println("Atualização de Preço: R$" + product.getpreco());
		
		System.out.println();
		System.out.println("Dados do Produto: " + product);
		
		System.out.println();
		System.out.println("Insira o numero de produtos a serem adicionados no estoque: ");
		int quantidade = sc.nextInt();
		product.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualização de dados: " + product);
		
		System.out.println();
		System.out.println("Insira o numero de produtos a serem removidos do estoque: ");
		quantidade=sc.nextInt();
		product.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualização de dados: " + product);
		
		
sc.close();
	}

}
