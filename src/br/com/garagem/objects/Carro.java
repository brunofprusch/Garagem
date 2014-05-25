package br.com.garagem.objects;

public class Carro {

	private Long id;
	private String nome;
	private String marca;
	private int ano;
	private String modelo;
	private String nomeDono;
	
	public Carro(){}
	
	public Carro(Long id, String nome, String marca, int ano, String modelo, String nomeDono){
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	
	public Float mediaTipoUm(Float a, Float b){
		//Float a = new Float(2);
		//Float b = new Float(2);
		//Float c;
		//c = (2 + 4) / 2;
		return new Float ((a + b) / 2);		
	}
	
	
	public Float mediaTipoDois(Float a, Float b, Float c){
		//Float a = new Float(2);
		//Float b = new Float(2);
		//Float c;
		//c = (2 + 4) / 2;
		return new Float ((a + b + c) / 3);		
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
	
	
}
