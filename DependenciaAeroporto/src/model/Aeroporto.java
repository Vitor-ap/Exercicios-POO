package model;

public class Aeroporto {

	private String nomeAeroporto;
	private String endereco;
	private boolean funcionando;
	private Passageiro passageiro;
	private Aeronave aeronave;
	
	public Aeroporto(){

		Passageiro passageiro = new Passageiro();
		Aeronave aeronave = new Aeronave();
	}
	
	
	

	public Aeronave getAeronave() {
		return aeronave;
	}




	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}




	public Passageiro getPassageiro() {
		return passageiro;
	}




	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}




	public String getNomeAeroporto() {
		return nomeAeroporto;
	}


	public void setNomeAeroporto(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public boolean isFuncionando() {
		return funcionando;
	}


	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
	public void saida(){
		
		System.out.println("O aviao " + aeronave.getNomeNave() + " decolou e nele estava o passageiro " + passageiro.getNome());
		}
	}

	

