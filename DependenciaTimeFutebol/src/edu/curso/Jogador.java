package edu.curso;

public class Jogador extends PessoaFisica{
 private String numContrato;
 private int qtdTitulos;
 private int ganhoBase;
 private int adicional;
 
 
public String getNumContrato() {
	return numContrato;
}
public void setNumContrato(String numContrato) {
	this.numContrato = numContrato;
}
public int getQtdTitulos() {
	return qtdTitulos;
}
public void setQtdTitulos(int qtdTitulos) {
	this.qtdTitulos = qtdTitulos;
}
public int getGanhoBase() {
	return ganhoBase;
}
public void setGanhoBase(int ganhoBase) {
	this.ganhoBase = ganhoBase;
}
public int getAdicional() {
	return adicional;
}
public void setAdicional(int adicional) {
	this.adicional = adicional;
}
 
public float calculaSalario() {
 return this.ganhoBase + this.adicional;
}
 
}
