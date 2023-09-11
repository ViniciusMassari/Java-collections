package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	List<Livro> catalogoLivros;
	
	public CatalogoLivros(){
		this.catalogoLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo,String autor,int anoPublicacao){
		catalogoLivros.add(new Livro(titulo,autor,anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String nomeAutor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		for(Livro livro : catalogoLivros){
			if(livro.getAutor().equalsIgnoreCase(nomeAutor)){
				livrosPorAutor.add(livro);
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal){
		
		List<Livro> livrosPorAnoPublicacao = new ArrayList<>();
		for(Livro livro: catalogoLivros){
			if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
				livrosPorAnoPublicacao.add(livro);
			}
		}
		return livrosPorAnoPublicacao;
	}
	
	public String pesquisarPorTitulo(String titulo){
		for(Livro livro: catalogoLivros){
			if(livro.getTitulo().equalsIgnoreCase(titulo)){
				return livro.toString();
			}
		}
		return "Nenhum livro achado";
	}
	
	
	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Livro 1", "Vinícius", 1930);
		catalogo.adicionarLivro("Livro 1", "carlos", 1931);
		catalogo.adicionarLivro("Livro 2", "Vinícius", 1950);
		catalogo.adicionarLivro("Livro 3", "Carlos", 1970);
		catalogo.adicionarLivro("Livro 4", "Ana", 1967);
		
		System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
	}
}
