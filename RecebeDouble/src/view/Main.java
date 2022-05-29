package view;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int n1;
		int n2;
		int nt;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: ")); // Quinta Linha a partir da Main 
		nt = n1+n2;
		JOptionPane.showMessageDialog(null, nt);
	}

}
