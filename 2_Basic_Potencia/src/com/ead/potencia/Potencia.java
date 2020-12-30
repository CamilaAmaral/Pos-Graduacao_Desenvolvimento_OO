package com.ead.potencia;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main(String[] args) {
		
		double base, expoente, resultado;
		
		try {
			String baseEscolhida = JOptionPane.showInputDialog("Informe a base");
			base = Double.parseDouble(baseEscolhida);
			String expoenteEscolhido = JOptionPane.showInputDialog("Informe o expoente");
			expoente = Double.parseDouble(expoenteEscolhido);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inválido. Fechando o programa...");
			return;
		}
		
		resultado = Math.pow(base, expoente);
		JOptionPane.showMessageDialog(null,  base + " elevado a " + expoente + " é igual a " + resultado);
	}
}
