package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itensLista;
	
	public CarrinhoDeCompras(){
		this.itensLista = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade){
		itensLista.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome){
		List<Item> itemsParaRemover = new ArrayList<>();
		
		for(Item item: itensLista){
			if(item.getNome().equalsIgnoreCase(nome)){
				itemsParaRemover.add(item);
			}
		}
		
		itensLista.removeAll(itemsParaRemover);
	}
	
	public double calcularValorTotal(){
		double valor = 0;
		for(Item item : itensLista){
			valor += (item.getPreco() * item.getQuantidade());
		}
		return valor;
	}
	
	public void exibirItens(){
		System.out.println(itensLista.toString());
	}
	
	public void itensNoCarrinho(){
		System.out.println("Há "+ itensLista.size() + " itens no carrinho");
	}
	
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("notebook", 2500.00, 1);
		carrinho.adicionarItem("Celular", 1500.30, 2);
		carrinho.itensNoCarrinho();
		carrinho.exibirItens();
		System.out.println("O valor total é "+carrinho.calcularValorTotal());
		carrinho.removerItem("notebook");
		carrinho.itensNoCarrinho();
		carrinho.exibirItens();
		System.out.println("O valor total é "+carrinho.calcularValorTotal());
		
	}
}
