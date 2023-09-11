package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> listaNumeros;
	
	private OrdenacaoNumeros(){
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public void ordenarAscendente(){
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
	}
	
	public void ordenarDescendente(){
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);
	}
	
	
	
	public static void main(String[] args) {
		OrdenacaoNumeros minhaLista = new OrdenacaoNumeros();
		
		minhaLista.adicionarNumero(0);
		minhaLista.adicionarNumero(5);
		minhaLista.adicionarNumero(10);
		minhaLista.adicionarNumero(100);
		minhaLista.ordenarDescendente();
		minhaLista.ordenarAscendente();
	}

}
