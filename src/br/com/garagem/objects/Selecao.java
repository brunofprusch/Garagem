package br.com.garagem.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Selecao {

	private String nomePais;
	private Integer pontos;
	
	public Selecao(String nomePais, Integer pontos){
		this.setNomePais(nomePais);
		this.setPontos(pontos);
	}
	
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	public Integer getPontos() {
		return pontos;
	}
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	
	public static HashMap montarGrupo(String selecaoUm, String selecaoDois, String selecaoTres, String selecaoQuatro){
		HashMap map = new HashMap();
		
	
			map.put(selecaoUm, new Selecao(selecaoUm, new Integer(0)));
			map.put(selecaoDois, new Selecao(selecaoDois, new Integer(0)));
			map.put(selecaoTres, new Selecao(selecaoTres, new Integer(0)));
			map.put(selecaoQuatro, new Selecao(selecaoQuatro, new Integer(0)));
			
		
		return map;
	}
	
	public static Boolean analisarDoisPrimeiros(List<Selecao> listDoisPrimeiros, HashMap mapSelecoes, List<Jogo> listJogos){
		Jogo jogo = null;
		Selecao selecao = null;
		
		for(int i=0; i <= listJogos.size(); i++){
			jogo = listJogos.get(i);
			
			if(jogo.getGolsTimeUm().compareTo(jogo.getGolsTimeDois()) > 0){
				selecao = (Selecao) mapSelecoes.get(jogo.getTimeUm());
				selecao.setPontos(selecao.getPontos() + 3);
				mapSelecoes.put(selecao.getNomePais(), selecao);
			
			}else if(jogo.getGolsTimeDois().compareTo(jogo.getGolsTimeUm()) > 0){
				selecao = (Selecao) mapSelecoes.get(jogo.getTimeDois());
				selecao.setPontos(selecao.getPontos() + 3);
				mapSelecoes.put(selecao.getNomePais(), selecao);
				
			}else{
				
				
				
			}
			
			
			
		}
		return Boolean.FALSE;
	}
	
	
	
}
