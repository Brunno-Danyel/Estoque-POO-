package entities;

public class Product {
     private String nome; 
     private double preco;
     private int quantidade;
     
     public Product() {
    	 
     }
     public Product(String nome, double preco, int quantidade) { //(CONSTRUTOR)
    	 this.nome = nome;
    	 this.preco = preco;
    	 this.quantidade = quantidade;
     }
     public Product(String nome, double preco) { //(SOBRECARGA)
    	 this.nome = nome;
    	 this.preco = preco;
    	 
     }
     public void setNome(String nome) {
    	 this.nome = nome;
     }
     public String getNome() {
    	 return nome;
     }
     public void setpreco(double preco) {
    	 this.preco = preco;
    	 
     }
     public double getpreco() {
    	 return preco;
     }
     
     public double valorTotalEmEstoque() {
    	 return preco * quantidade;
     }
	
     public void adicionarProduto(int quantidade) {
    	 this.quantidade += quantidade;
     }
     
     public void removerProduto(int quantidade) {
    	 this.quantidade -= quantidade;
     }
     public String toString() {
    	 return nome
    	 + ", R$ "
    	 + String.format("%.2f", preco)
    	 + ", "
    	 + quantidade
    	 + " unidades, Total: R$ "
    	 + String.format("%.2f", valorTotalEmEstoque());
    	 }
     
}
