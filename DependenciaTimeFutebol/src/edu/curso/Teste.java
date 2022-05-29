package edu.curso;

public class Teste {

	
	public static void main(String[] args) {
		Estadio est = new Estadio();
		Ingresso i = new Ingresso();
		i.setEstadio(est);
		
		
		Partida p1 = new Partida();
		Time time = new Time();
		Time time2 = new Time();
		
		time.setNome("SPFC");
		time2.setNome("GAMBÁS");
		
		p1.setTimeCasa(time.getNome());
		p1.setTimeVisitante(time2.getNome());
		p1.setQtdGolsCasa(2);
		p1.setQtdGolsFora(1);
		
		p1.verificaVencedor();
		
		
		est.setCapacidade(60000);
		est.setNome("Morumbi");
		i.setComprados(40000);
		
		i.calculaDisponiveis();
		
		Tecnico t1 = new Tecnico();
		
		t1.setNome("ROGERIO CENI");
		t1.setVitorias(30);
		t1.setQtdJogos(60);
		
		System.out.println("Aproveitamento: " + t1.getAproveitamento());
	}
}
