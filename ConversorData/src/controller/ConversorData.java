package controller;


public class ConversorData {
    private int ano;
    private int mes;
    private int dia;

    
   
    ConversorData(int valorAno, int valorMes, int valorDia) {
        this.setAno(valorAno);
        this.setMes(valorMes);
        this.setDia(valorDia);
    }
    
    public int getAno() {
    	return this.ano;
    }
    	
    public void setAno(int ano) {
    	this.ano = ano;
    }
    
    public int getMes() {
    	return this.mes;
    }
    	
    public void setMes(int mes) {
    	this.mes = mes;
    }
    
    public int getDia() {
    	return this.dia;
    }
    	
    public void setDia( int dia ) {
    	this.dia = dia;
    }
    
    public int dataJuliana(){
        return ( 1461 * ( ano + 4800 + ( mes - 14)/12 )  ) / 4 + ( 367 * ( mes - 2- 12 * (  ( mes - 14)/12 )  ) ) /12 -
                ( 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 )  ) / 4 + dia - 32075;
    }

    
    public static void main(String[] args) {
    	
    	ConversorData cv = new ConversorData(2016,8,05);
    	System.out.println(cv.dataJuliana());
    }
}