package com.ead.adivinhacao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adivinhacao {

	public static void main(String[] args) {
		
		Random random = new Random();
		int numeroCorreto = random.nextInt(50) + 1;
		
		String numeroEscolhido = JOptionPane.showInputDialog("Pense em um número de 1 a 50. Qual é? (Digite 0 para desistir)");
		 int numero = Integer.parseInt(numeroEscolhido);
		 
		 int i=1;
		 while (numero != 0) {
			 int tentativas = i++;
			 if (numero == numeroCorreto) {
				JOptionPane.showMessageDialog(null, "Você acertou o número " + numeroCorreto + " depois de " + tentativas + " tentativa(s).");
				return;
			}
			 else if (numero > numeroCorreto ) {
				 numeroEscolhido = JOptionPane.showInputDialog("O número correto é menor que o número informado. Tente de novo: ");
				 numero = Integer.parseInt(numeroEscolhido);
			}
			 else {
				 JOptionPane.showInputDialog("O número correto é maior que o número informado. Tente de novo:  ");
				 numeroEscolhido = JOptionPane.showInputDialog("O número correto é menor que o número informado. Tente de novo: ");
				 numero = Integer.parseInt(numeroEscolhido);
			 }
			
		}

	}

}
