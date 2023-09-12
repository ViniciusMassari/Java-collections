package map.Ordenacao;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> produtosMap;

	public EstoqueProdutos() {
		this.produtosMap = new HashMap<>();
	}
	
	
	public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
		produtosMap.put(codigo, new Produto(nome,quantidade,preco));
	}
	
	public void exibirProdutos(){
		System.out.println(produtosMap);
	}
	
	public double calcularValorTotalEstoque(){
		if(!produtosMap.isEmpty()){
			double valorTotalEstoque = 0;
			for(Produto p : produtosMap.values()){
				valorTotalEstoque += (p.getPreco() * p.getQuantidade());
			}
			
			return valorTotalEstoque;
		}
		return 0;
	}
	
	
	public Produto obterProdutoMaisCaro(){
		Produto produtoMaisCaro = null;
		
		if(!produtosMap.isEmpty()){
			double preco = 0;
			for(Produto p : produtosMap.values()){
				if(p.getPreco() > preco){
					preco = p.getPreco();
					produtoMaisCaro = p;
				}
			}
			
		}
		
		return produtoMaisCaro;
	}
	
	
	public Produto obterProdutoMaisBarato(){
		Produto produtoMaisBarato = null;
		
		if(!produtosMap.isEmpty()){
			double preco = Double.MAX_VALUE;
			for(Produto p : produtosMap.values()){
				if(p.getPreco() < preco){
					preco = p.getPreco();
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoDeMaiorQuantidadeNoEstoque(){
		double valorProduto = 0;
		Produto produtoEmMaiorQuantidade = null;
		if(!produtosMap.isEmpty()){
			double valorTotal = 0;
			for(Produto p : produtosMap.values()){
					valorTotal = p.getPreco() * p.getQuantidade();
					valorProduto = valorTotal;
				if(valorProduto > valorTotal){
					produtoEmMaiorQuantidade = p;
				}
			}
		}
		
		return produtoEmMaiorQuantidade;
	}
	

	
}
