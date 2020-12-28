package br.com.ead.programas;

import javax.swing.JOptionPane;

public class TesteExcecores {

	public static double calcularArea(double base, double altura) throws Exception {
		
//		  Consideramos que não seja possível retangulos com lados negativos.
		 
		if(base <= 0 || altura <= 0) {
			throw new Exception("Os lados do retêngulo devem ser positivos!");
		}
		
		return base * altura;
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("pArea = " + calcularArea(-10, 5));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
