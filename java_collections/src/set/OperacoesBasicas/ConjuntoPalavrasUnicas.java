package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
		private Set<String> conjuntoDePalavras;
	
	public ConjuntoPalavrasUnicas(){
		this.conjuntoDePalavras = new HashSet<String>();
	}
	
	public void adicionarPalavra(String novaPalavra){
		if(conjuntoDePalavras.contains(novaPalavra)) {
			System.out.println("A palavra já existe");
		} else {
			conjuntoDePalavras.add(novaPalavra);
		}
		
	}
	
	public void removerPalavra(String palavra){
		String palavraParaRemover = "";
		for(String p : conjuntoDePalavras ) {
			if(p == palavra) {
				palavraParaRemover = p;
				break;
			}
			conjuntoDePalavras.remove(palavraParaRemover);
		
	}
	

}
	
	public void verificarPalavra(String palavra){
		
		if(conjuntoDePalavras.contains(palavra)) {
			System.out.println("A palavra existe");
		} else {
			System.out.println("A palavra não existe");
			
		}
}
	
	public void exibirPalavrasUnicas(){
		System.out.println(conjuntoDePalavras);
	}

	
	
	
}