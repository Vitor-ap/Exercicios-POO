package model;

public class Dinossauro {
	
	private int energia;
	private int velocidade;
	private int temperatura;
	private String humor = "";
	
	
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public String getHumor() {
		return humor;
	}
	public void setHumor(String humor) {
		this.humor = humor;
	}
	
	
	
	
	
	
	
	
	public void pular() {
		System.out.println("\nDinossauro pulou");
		this.velocidade = this.velocidade - 2;
		this.energia= this.energia - 4;
		this.humor = "Feliz";
	}
	
	
	public void correr() {
		System.out.println("\nDinossauro correu");
		this.velocidade = this.velocidade - 5;
		this.energia= this.energia - 6;
		this.humor = "Feliz";
		
	}
	
	public void comer() {
		System.out.println("\nDinossauro Comeu");
		this.energia = this.energia + 4;
		this.velocidade = this.velocidade - 3;
		this.humor = "Feliz";
	}
	
	public void cantar(){
		System.out.println("\nDinossauro cantou");
		this.energia = this.energia - 2;
		this.humor = "Feliz";
	}
	
	public void tomarSol() {
		System.out.println("\nDinossauro Tomou Sol");
		this.velocidade = this.velocidade + 5;
		this.temperatura = this.temperatura + 6;
		this.humor = "Feliz";
	}
	
	public void ficaNaSombra() {
		System.out.println("\nDinossauro ficou na sombra");
		this.energia++;
		this.temperatura = this.temperatura - 5;
		this.humor = "Triste";
	}
	
	
	
}
	

