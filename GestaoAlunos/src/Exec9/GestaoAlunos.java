package Exec9;

import java.util.Scanner;

public class GestaoAlunos {

	Scanner scan = new Scanner(System.in);
	int indice;
	Aluno alunos[] = new Aluno[50];
	
	
	
	public static void main(String[] args) {
		GestaoAlunos g = new GestaoAlunos();
		/*for (int indice = 0; indice <= 50; indice++) {
			
		}*/
		g.menu();
		
		}
	
	
	
	
	
	
	
	
	public void criar() {
		Aluno instancia = new Aluno();
		
		for (indice = 0; indice <=50; indice ++) {
			
		
				if (alunos[indice]== null) {
			
		
				System.out.println("Informe o ID do aluno a ser matriculado:");
				instancia.setId(scan.nextLong());
				System.out.println("Informe a data de nascimento do aluno a ser matriculado:");
				instancia.setNascimento(scan.nextLine());
				System.out.println("Informe o RA do aluno a ser matriculado:");
				instancia.setRa(scan.nextLine());
				System.out.println("Informe o nome do aluno a ser matriculado:");
				instancia.setNome(scan.nextLine());
		
				alunos[indice] = instancia;
				
				System.out.println("\nAluno cadastrado!!! ");
				menu();
				}
		}
				
					System.err.println("Todos os 50 campos preenchidos");
					menu();
	}
		
	
	
	public void exibir() {
		System.out.println("Informe o RA do aluno que que deseja exibir");
		String sRA = scan.nextLine();
		try{
		for (indice = 0; indice <= 50; indice++) {
			
				if (alunos[indice].getRa() == sRA) {
					String exibe = alunos.toString();
					System.out.println(exibe);
				}
			}
		}
			catch (NullPointerException e){
				e.printStackTrace();
				System.err.println("Nenhum aluno encontrado");
			}
			finally {
				menu();
			}
		}
	
	
		
	
	public void excluir() {
		System.out.println("Informe o RA do aluno que que deseja excluir");
		String sRA = scan.nextLine();
		try {
		for (int indice = 0; indice <= 50; indice++) {
			
				if (alunos[indice].getRa() == sRA) {
				alunos[indice] = null;
				System.out.println("Aluno excluído");
			}
			
			}
		}
		catch (NullPointerException e) {
			System.err.println("Nenhum aluno encontrado \n");
		}
			
		finally {
			
			menu();
		}
	}
	
			
		
	
	
	
	
	public void atualizar() {
		System.out.println("Informe o RA do aluno que que deseja Atualizar");
		String sRA = scan.nextLine();
		try {
		for (int indice = 0; indice <= 50; indice++) {
			
				if (alunos[indice].getRa() == sRA) {
					System.out.println("Informe o ID do aluno para atualizar:");
					alunos[indice].setId(scan.nextInt());
					System.out.println("Informe nova data de nascimento do aluno:");
					alunos[indice].setNascimento(scan.nextLine());
					System.out.println("Informe a alteracao no nome do aluno:");
					alunos[indice].setNome(scan.nextLine());
				}
			}
		}
			catch(NullPointerException e) {
				System.err.println("nenhum aluno encontrado\n");
			}
			finally {
				
				menu();
			}
			
	}
	
	
	
	public void menu() {
		int opcao  = ' ' ;
		while (opcao != 'S' ) {
			
			System.out.println(" Menu de Gestao de Alunos, informe opcao desejada \n(C)riar"
					+ "\n(E)xibir\n(R)emover "
					+ "\n(A)tualizar\n(S)air");
			
			String textoMaisculo = scan.nextLine().toUpperCase();
			opcao = textoMaisculo.charAt(0);
			
			switch (opcao) {
			
			case 'C':
				criar();
				break;
				
			case 'E':
				exibir();
				break;
				
			case 'R':
				excluir();
				break;
				
			case 'A':
				atualizar();
				break;
				
			case 'S':
				 System.exit(0);
				 System.out.println("Finalizando o programa");
				 opcao = 'S';
				break;
			
			default:
				
		}
	}
	
}
		
}


