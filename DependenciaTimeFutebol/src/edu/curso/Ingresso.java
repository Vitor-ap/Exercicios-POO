package edu.curso;

public class Ingresso {
	
	
	
	
	private Estadio estadio;
	private int comprados;
	private int disponiveis;
	
	public Ingresso() {
		Estadio es1 = new Estadio();
	}
	
	
	
	
	
	public Estadio getEstadio() {
		return estadio;
	}
	
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	public void setDisponiveis(Estadio estadio) {
		this.estadio = estadio;
	}
	public int getComprados() {
		return comprados;
	}
	public void setComprados(int comprados) {
		this.comprados = comprados;
	}
	
	public void calculaDisponiveis() {
		
		this.disponiveis = estadio.getCapacidade() - this.comprados;
		System.out.println("Estadio: "+estadio.getNome() +" tem " + this.disponiveis + " ingressos disponiveis.");
	}
}
