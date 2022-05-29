package edu.curso;

public class Patrocinador extends PessoaFisica{

	private int tempoParceria;

	public int getTempoParceria() {
		return tempoParceria;
	}

	public void setTempoParceria(int tempoParceria) {
		this.tempoParceria = tempoParceria;
	}
	
	public float calculaGanho() {
		return this.tempoParceria * 25000;
	}
}
