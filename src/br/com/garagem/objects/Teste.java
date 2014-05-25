package br.com.garagem.objects;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Teste {

	private List<Jogo> listJogos;
	private HashMap mapGrupo;
	private List<Selecao> listDoisPrimeiros;
	
	/*
	@Test
	public void testUm() {	
		Carro carro = new Carro();
		Float a = new Float(2);
		Float b = new Float(2);
		
		assertEquals(new Float(2), carro.mediaTipoUm(a, a), 0.01);
		System.out.println("Sucess for TestUm");
	}
	
	@Test
	public void testDois() {	
		Carro carro = new Carro();
		Float a = new Float(3);
		Float b = new Float(3);
		Float c = new Float(3);
		
		assertEquals(new Float(3), carro.mediaTipoDois(a, a, c), 0.01);
		System.out.println("Sucess for TesteDois");
	}
	*/
	
	@Test
	public void meuTesteJogo(){
		Carro carro = new Carro();
		
		Integer golsInter = new Integer(4);
		Integer golsGremio = new Integer(1);
		assertEquals("E", carro.validarJogo(golsInter, golsGremio));

	}
	
	@Test
	public void exemploProfTesteJogo(){
		Jogo grenal = new Jogo("Inter", "Gremio", new Integer(4), new Integer(1));
		
		//assertEquals("Inter", grenal.vencedor());
	}
	
	
	
	@Test
	public void empatou(){
		
	}
	
	@Test
	public void quemGranhouFoiSanLorenzo(){
		
	}
	
	
	@Before
	public void setUp(){
		listJogos = new ArrayList();
		mapGrupo = Selecao.montarGrupo("Brasil", "México", "Croácia", "Camarões");;
		Jogo.popularListJogos(listJogos, new Jogo("Brasil", "México", new Integer(2), new Integer(1)));
		Jogo.popularListJogos(listJogos, new Jogo("Brasil", "Croácia", new Integer(3), new Integer(1)));
		Jogo.popularListJogos(listJogos, new Jogo("Brasil", "Camarões", new Integer(4), new Integer(2)));
		Jogo.popularListJogos(listJogos, new Jogo("México", "Croácia", new Integer(3), new Integer(2)));
		Jogo.popularListJogos(listJogos, new Jogo("México", "Camarões", new Integer(4), new Integer(3)));
		Jogo.popularListJogos(listJogos, new Jogo("Croácia", "Camarões", new Integer(2), new Integer(4)));
		
		listDoisPrimeiros = new ArrayList<>();
		listDoisPrimeiros.add(new Selecao("Brasil", new Integer(0)));
		listDoisPrimeiros.add(new Selecao("México", new Integer(0)));
	}
	
	@Test
	public void colocacaoGrupoCopa(){
		assertEquals(Boolean.TRUE, Selecao.analisarDoisPrimeiros(listDoisPrimeiros, mapGrupo, listJogos));
	}
	
}
