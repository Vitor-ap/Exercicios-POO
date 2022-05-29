package model;

public class Piloto extends Pessoa{

	private int idPiloto;
	private int salario;
	private int tempoExperiencia;
	private Aeronave aeronave;
	
	public Piloto(){
		Aeronave aeronave = new Aeronave();
	
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}

	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}

	

	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getTempoExperiencia() {
		return tempoExperiencia;
	}

	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	
	
	public void pilotar() {
		
		System.out.println("O sr.  " + this.getNome()+ "  id: " + this.idPiloto+ " está pilotando o avião " + aeronave.getModelo() + 
				", de cor :" + aeronave.getCor());
	}
	
	
}
