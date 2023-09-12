package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
	Set<Contato> agendaDeContatos;

	public AgendaContatos() {
		this.agendaDeContatos = new HashSet<Contato>();
	}
	
	public void adicionarContato(String nome, int numero){
		agendaDeContatos.add(new Contato(nome, numero));
	}
	
	
	public void exibirContatos(){
		System.out.println(agendaDeContatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : agendaDeContatos){
			if(c.getNome().startsWith(nome)){
				contatosPorNome.add(c);
			}
		}
		
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero){
		Contato contatoParaAtualizar = null;
		for(Contato c : agendaDeContatos){
			if(c.getNome().equalsIgnoreCase(nome)){
			c.setNumero(novoNumero);
			contatoParaAtualizar = c;
			break;
			}
		}
		
		return contatoParaAtualizar;
	}
}
