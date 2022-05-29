package model;

public class Aeronave {

	private String nomeNave;
	private String modelo;
	private String cor;
	private Passageiro passageiro;
	private Aeroporto aeroporto;
	
	public Aeronave() {
		Passageiro passageiro = new Passageiro();
		Aeroporto aeroporto = new Aeroporto();
	}
	

	
	public Passageiro getPassageiro() {
		return passageiro;
}



	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}


	
	public Aeroporto getAeroporto() {
	return aeroporto;
}



	public void setAeroporto(Aeroporto aeroporto) {
	this.aeroporto = aeroporto;
}

	
	

	public String getNomeNave() {
		return nomeNave;
	}




	public void setNomeNave(String nomeNave) {
		this.nomeNave = nomeNave;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getCor() {
		return cor;
	}




	public void setCor(String cor) {
		this.cor = cor;
	}




	public void decolar() {
		
		System.out.println("O avião #" + this.nomeNave + " esta decolando do aeroporto "+ aeroporto.getNomeAeroporto()+ ", situado na "+ aeroporto.getEndereco());
	}
	
}
