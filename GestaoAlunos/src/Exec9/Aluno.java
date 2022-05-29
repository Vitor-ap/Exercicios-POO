package Exec9;


public class Aluno {

	private long id;
	private String nascimento;
	private String ra;
	private String nome;
	
	
	
	
	public Aluno() {
		
	}

	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String toString() {
		return "ID: #"+ this.getId() + "\nAluno: " + this.getNome() + "\nData de nascimento: " + this.getNascimento() + "\nRA: "+ this.getRa();
	}
	
}
