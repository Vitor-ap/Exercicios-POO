package view;

import model.Aeronave;
import model.Aeroporto;
import model.Passageiro;
import model.Piloto;

public class PrincipalAeroporto {

	public static void main(String[] args) {
		
		
	
		
		
		Aeronave aer1 = new Aeronave();
		Aeroporto air1 = new Aeroporto();
		Passageiro pass1 = new Passageiro();
		Piloto piloto1 = new Piloto();
		
		
		//aviao
		aer1.setModelo("Air buss 300");
		aer1.setCor("Branco");
		aer1.setNomeNave("AIRB300B");
		aer1.setAeroporto(air1); // associacao aviao com o aeroporto
		aer1.setPassageiro(pass1);
		
		
		//aeroporto
		air1.setEndereco("BR 208, KM 23");
		air1.setNomeAeroporto(" 'Aeroporto Internacional de Algum lugar' ");
		air1.setPassageiro(pass1); //associacao aeroporto com o passageiro
		air1.setAeronave(aer1); // associacao aeroporto com o aviao
		
		// passageiro
		pass1.setNome("Vitor");
		pass1.setPesoBagagem(25);
		pass1.setIdPassagem(28548);
		pass1.setAeronave(aer1); // associacao passageiro com aviao
		pass1.setAeroporto(air1); // associacao passageiro com aeroporto
		
		// piloto
		piloto1.setIdPiloto(22222);
		piloto1.setNome("Lucas");
		piloto1.setAeronave(aer1); // piloto associado ao aviao
		
		
		// execucao dos metodos
		pass1.comprarPassagem();
		piloto1.pilotar();
		aer1.decolar();
		air1.saida();
		
		
	}

}
