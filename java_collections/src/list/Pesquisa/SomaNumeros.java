package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumeros;
	
	public SomaNumeros(){
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero){
		this.getListaNumeros().add(numero);
	}
	
	public int calcularSoma(){
		 int soma = 0;
		 
		 for(Integer n : listaNumeros){
			 soma += n;
		 }
		 
		 return soma;	
	}
	
	public int encontrarMaiorNumero(){
	 int maiorNumero = 0;
		 
		 for(Integer n : listaNumeros){
			 if(n > maiorNumero) {
			 maiorNumero = n;
			 }
		 }

		 
		 return maiorNumero;
	}
	
	public int encontrarMenorNumero(){
		 int menorNumero = Integer.MAX_VALUE;
			 
			 for(Integer n : listaNumeros){
				 if(n < menorNumero) {
					 menorNumero = n;
				 }
			 }
			 
			 return menorNumero;
		}
	
	public void exibirNumeros(){
		System.out.println(this.listaNumeros.toString());
	}
	
	
	
	@Override
	public String toString() {
		return "" + listaNumeros + "";
	}

	public List<Integer> getListaNumeros(){
		return this.listaNumeros;
	}
}
