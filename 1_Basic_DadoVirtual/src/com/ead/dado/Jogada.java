package com.ead.dado;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogada {

	public static void main(String[] args) {

		Random random = new Random();
//		JOptionPane.showMessageDialog(null, random.nextInt(6) + 1);
		
		String numeroEscolhido = JOptionPane.showInputDialog("Digite um n�mero: ");
		int numero = Integer.parseInt(numeroEscolhido);
		int numeroInteiroAleatorio_1_a_6 = random.nextInt(6) + 1;
		
		if (numeroInteiroAleatorio_1_a_6 == numero) {
			JOptionPane.showMessageDialog(null, "O numero sorteado foi: " + numeroInteiroAleatorio_1_a_6 + ". Parab�ns! Voc� Certou!");
		}
		else {
			JOptionPane.showMessageDialog(null, "O numero sorteado foi: " + numeroInteiroAleatorio_1_a_6 + ". Que pena! Tente outra vez!");
		}
	}
}
