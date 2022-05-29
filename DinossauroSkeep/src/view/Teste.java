package view;

import java.util.Scanner;

import model.Dinossauro;

public class Teste {

	 
	
	public static void main(String[] args) {
		
		
		Dinossauro dino = new Dinossauro();
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		
		
		while (i == 0) {
			
			System.out.println("\nStatus do Dinossauro: \nHumor ==> "+ dino.getHumor()+"\nTemperatura ==> " +dino.getTemperatura()
			+ "\nEnergia ==> "+ dino.getEnergia()+"\nVelocidade ==> "+dino.getVelocidade());
			
			
			System.err.println("\nQual será a acao do dinossauro? \n (P)ular    (C)orrer     Co(M)er"
					+ "\nC(A)NTAR       Tomar (S)ol      Ficar na s(O)mbra");
			
			String textoMaiusculo = scan.nextLine().toUpperCase();
			char letra = textoMaiusculo.charAt(0);
			
				switch (letra) {
				
					case 'P':
						dino.pular();
						break;
					
					case 'C':
						dino.correr();
						break;
					
					case 'M':
						dino.comer();
						break;
					
					case 'A':
						dino.cantar();
						break;
					
					case 'S':
						dino.tomarSol();
						break;
					
					case 'O':
						dino.ficaNaSombra();
						break;
					
					default:	
				}			
		}
		
		
	}

}
