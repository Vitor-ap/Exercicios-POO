package edu.curso;

public class Partida {

	private String timeCasa;
	private String timeVisitante;
	private int qtdGolsCasa;
	private int qtdGolsFora;
	
	
	public String getTimeCasa() {
		return timeCasa;
	}
	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public int getQtdGolsCasa() {
		return qtdGolsCasa;
	}
	public void setQtdGolsCasa(int qtdGolsCasa) {
		this.qtdGolsCasa = qtdGolsCasa;
	}
	public int getQtdGolsFora() {
		return qtdGolsFora;
	}
	public void setQtdGolsFora(int qtdGolsFora) {
		this.qtdGolsFora = qtdGolsFora;
	}
	
	
	public void verificaVencedor() {
		if (this.qtdGolsCasa > this.qtdGolsFora) {
			System.out.println(this.timeCasa +" venceu!  ==> " + this.qtdGolsCasa + " a " +this.qtdGolsFora);
		}
		
		else if (this.qtdGolsFora > this.qtdGolsCasa) {
			System.out.println(this.timeVisitante +" venceu!  ==> " + this.qtdGolsFora + " a " +this.qtdGolsCasa);
		}
		else {
			System.out.println("Empatou! Ambos fizeram " + this.qtdGolsCasa +" gols." );
		}
		
		
	}
	
}
