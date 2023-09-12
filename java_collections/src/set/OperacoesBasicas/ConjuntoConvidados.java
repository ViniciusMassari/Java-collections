package set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;
public class ConjuntoConvidados {
	private Set<Convidado> convidadosSet;

	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<Convidado>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite){
		convidadosSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite){
		Convidado convidadoParaRemocao = null;
		
		for(Convidado c: convidadosSet){
			if(c.getCodigoConvite() == codigoConvite){
				convidadoParaRemocao = c;
				break;
			}
		}
		convidadosSet.remove(convidadoParaRemocao);
	}
	
	
	public int contarConvidados() {
		return convidadosSet.size();
	}
	
	public void exibirConvidados(){
		System.out.println(convidadosSet);
	}
	
	
	
}
