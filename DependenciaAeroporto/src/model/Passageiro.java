package model;

public class Passageiro extends Pessoa{

	private int idPassagem;
	private float pesoBagagem;
	private boolean ativo;
	private Aeroporto aeroporto;
	private Aeronave aeronave; 
	//
	
	public Passageiro(){
		Aeronave aeronave = new Aeronave();
		Aeroporto aeroporto = new Aeroporto();
		
	}
	


	public int getIdPassagem() {
		return idPassagem;
	}


	public void setIdPassagem(int idPassagem) {
		this.idPassagem = idPassagem;
	}


	public float getPesoBagagem() {
		return pesoBagagem;
	}


	public void setPesoBagagem(float pesoBagagem) {
		this.pesoBagagem = pesoBagagem;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	


	public Aeroporto getAeroporto() {
		return aeroporto;
	}


	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}


	public Aeronave getAeronave() {
		return aeronave;
	}


	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
	
	
	
public void comprarPassagem(){
		
		System.out.println("O passageiro "+ this.getNome() + " comprou a passagem nº " + this.getIdPassagem() +
				" e está com uma basagem de " + this.getPesoBagagem() + " kg.");
		System.out.println("Ele ira viajar no aviao " + aeronave.getModelo() );
		System.out.println("O avião saira do aeroporto " + aeroporto.getNomeAeroporto() );
	}
}
