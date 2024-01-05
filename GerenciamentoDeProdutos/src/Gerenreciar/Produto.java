package Gerenreciar;

public class Produto {
	private String nome;
	private String id;
	private Double preco;
	private int quantidadeEstoque;
	
	
	public Produto(String nome, String id, Double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.id = id;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void updateProdutoComprado(int quantidadeEstoque) {
		if(quantidadeEstoque>0) {
			this.quantidadeEstoque+=quantidadeEstoque;
			System.out.println("Foi atualizado com successo ");
			
		}else {
			System.out.println("A quantidade deve ser maior que zero");
		}
	}
	public void updateProdutoVendido(int quantidadeVendida) {
		if(quantidadeVendida >0 && quantidadeVendida<=quantidadeEstoque) {
			this.quantidadeEstoque-=quantidadeVendida;
			System.out.println("Venda realizada com Sucesso");
			
			
		}else if(quantidadeVendida<=0){
			
			System.out.println("A quantidade deve ser maior que zero");
		}
	
	else {
			System.out.println("Produto insuficiente");
	}
		
	}
}
