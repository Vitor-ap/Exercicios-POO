package edu.curso;

import java.time.LocalDate;

public class Time extends PessoaJuridica{
	
	private int qtdTitulos;
	private LocalDate fundacao;
	private int vitorias;
	private int derrotas;
	private int qtdTorcedores;
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdTitulos() {
		return qtdTitulos;
	}
	public void setQtdTitulos(int qtdTitulos) {
		this.qtdTitulos = qtdTitulos;
	}
	public LocalDate getFundacao() {
		return fundacao;
	}
	public void setFundacao(LocalDate fundacao) {
		this.fundacao = fundacao;
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
	public int getQtdTorcedores() {
		return qtdTorcedores;
	}
	public void setQtdTorcedores(int qtdTorcedores) {
		this.qtdTorcedores = qtdTorcedores;
	}

	
	
	
}
