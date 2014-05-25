package br.com.garagem.objects;

import java.util.List;

public class Jogo {
	
	private String timeUm;
	private String timeDois;
	private Integer golsTimeUm;
	private Integer golsTimeDois;
	
	
	public Jogo(String timeUm, String timeDois, Integer golsTimeUm, Integer golsTimeDois){
		this.setTimeUm(timeUm);
		this.setTimeDois(timeDois);
		this.setGolsTimeUm(golsTimeUm);
		this.setGolsTimeDois(golsTimeDois);
	}
	
	public String getTimeUm() {
		return timeUm;
	}

	public void setTimeUm(String timeUm) {
		this.timeUm = timeUm;
	}

	public String getTimeDois() {
		return timeDois;
	}

	public void setTimeDois(String timeDois) {
		this.timeDois = timeDois;
	}
	
	public Integer getGolsTimeUm() {
		return golsTimeUm;
	}

	public void setGolsTimeUm(Integer golsTimeUm) {
		this.golsTimeUm = golsTimeUm;
	}

	public Integer getGolsTimeDois() {
		return golsTimeDois;
	}

	public void setGolsTimeDois(Integer golsTimeDois) {
		this.golsTimeDois = golsTimeDois;
	}


	/*
	public Boolean validarJogo(Integer golsInter, Integer golsGremio){
		
		if(golsInter.compareTo(golsGremio) >= 0){
			return Boolean.TRUE;
		}else{
			return Boolean.FALSE;
		}
	}
	*/



	public String validarJogo(Integer golsInter, Integer golsGremio){
		
		if(golsInter.compareTo(golsGremio) > 0){
			return "V";
		}else if(golsInter.compareTo(golsGremio) < 0){
			return "D";
		}else{
			return "E";
		}
	}
	
	public String vencedor(Jogo jogo){
		
		if(jogo.getGolsTimeUm().compareTo(jogo.getGolsTimeDois()) > 0){
			return jogo.getTimeUm();
		}else{
			return jogo.getTimeDois();
		}
	}
	
	public Boolean deuEmpate(Jogo jogo){
		
		if(jogo.getGolsTimeUm().compareTo(jogo.getGolsTimeDois()) == 0){
			
		}
		
		return Boolean.TRUE;
	}
	
	public static List<Jogo> popularListJogos(List<Jogo> listJogos, Jogo jogo){
		
		listJogos.add(jogo);
		
		return listJogos;
	}
	
	
}
