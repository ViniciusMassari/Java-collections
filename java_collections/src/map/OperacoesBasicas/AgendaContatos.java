package map.OperacoesBasicas;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
	private Map<String, Integer> agendaDeContatos;

	public AgendaContatos() {
		this.agendaDeContatos = new HashMap<String, Integer>();
	}
	
	public void adicionarContato(String nome, Integer telefone){
		agendaDeContatos.put(nome,telefone);
	}
	
	public void removerContato(String nome){
		if(!agendaDeContatos.isEmpty()){
			agendaDeContatos.remove(nome);
		}
	}
	
	
	public void exibirContatos(){
		System.out.println(agendaDeContatos);
	}
	
	public Integer pesquisarPorNome(String nome){
		Integer numeroPorNome = null;
		if(!agendaDeContatos.isEmpty()){
		numeroPorNome = agendaDeContatos.get(nome);
		}
		return numeroPorNome;
	};
	

}
