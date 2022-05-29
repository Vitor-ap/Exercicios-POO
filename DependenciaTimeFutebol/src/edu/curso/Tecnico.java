package edu.curso;

public class Tecnico extends PessoaFisica{

	private String registro;
	private int vitorias;
	private int derrotas;
	private int qtdJogos;
	private double aproveitamento;
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getQtdJogos() {
		return qtdJogos;
	}
	public void setQtdJogos(int qtdJogos) {
		this.qtdJogos = qtdJogos;
	}
	

	public double getAproveitamento() {
		return aproveitamento;
	}
	public void setAproveitamento(double aproveitamento) {
		this.aproveitamento = aproveitamento;
	}
	
	public void calculaAproveitamento() {
		this.aproveitamento = this.vitorias / this.qtdJogos * 100;
	}
	
}
