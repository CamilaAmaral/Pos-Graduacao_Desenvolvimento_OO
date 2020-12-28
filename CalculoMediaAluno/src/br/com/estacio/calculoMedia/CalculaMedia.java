package br.com.estacio.calculoMedia;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		
		double[] notas = new double[4];
		double soma = 0;
		double media = 0;
		
		try {
			for (int i = 0; i < notas.length; i++) {
				notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota " + (i + 1)));
				soma += notas[i];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally {
			media = soma / 4;
		}
		JOptionPane.showMessageDialog(null, "Média: " + media);

	}

}
