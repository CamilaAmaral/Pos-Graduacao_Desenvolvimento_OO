package com.ead.forca;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ForcaApplication {

	public static void main(String[] args) {
		
		JTextArea textoForca = new JTextArea();
		textoForca.setFont(new Font("Monospaced", Font.BOLD,20));
		
		Forca forca = new Forca();
		
		do {
			textoForca.setText(forca.getEstagioEnforcamento() + forca.getPalavraExibida());
			String letra = JOptionPane.showInputDialog(null, textoForca);
			if(letra.equals("")) {
				letra = "#";
			}
			letra = letra.substring(0, 1).toUpperCase();
			forca.testarLetra(letra);
		}while ((forca.getErros() < 6) && (forca.getPalavraExibida().toString().contains("-")));
		
		String resultado;
		
		if (forca.getErros() < 6) {
			resultado = "\n VOCÊ DESCOBRIU A PALAVRA!";
		}else {
			resultado = "\n VOCÊ FOI ENFORCADO!";
		}
		
		textoForca.setText(forca.getEstagioEnforcamento() + forca.getPalavraSecreta() + resultado);
		JOptionPane.showMessageDialog(null,  textoForca);

	}

}
