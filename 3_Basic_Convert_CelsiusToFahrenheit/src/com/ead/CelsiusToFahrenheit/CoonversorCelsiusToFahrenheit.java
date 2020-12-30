package com.ead.CelsiusToFahrenheit;

import javax.swing.JOptionPane;

public class CoonversorCelsiusToFahrenheit {

	public static void main(String[] args) {
		
		double celsius;
		
		try {
			String celsiusEscolhido = JOptionPane.showInputDialog("Informe os graus em Celsius: ");
			celsius = Double.parseDouble(celsiusEscolhido);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado é inválido. Finalizando programa...");
			return;
		}
		
		Double fahrenheit = conversor(celsius);
		
		JOptionPane.showMessageDialog(null, celsius + " Celsius = " + fahrenheit + " Fahrenheit.");

	}
	
	public static double conversor(double celsius) {
		double fahrenheit = ((celsius * 9) / 5) + 32;
		return fahrenheit;
	}

}
