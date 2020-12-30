package com.ead.adivinhacao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adivinhacao2 {

	public static void main(String[] args) {
		
		int tentativas = 0;
		int numeroPalpite = 0;
		int numeroSorteado;
		String mensagem;
		
		Random gerador = new Random();
		numeroSorteado = gerador.nextInt(50) + 1;
		
		mensagem = "Pense em um número de 1 a 50. Qual é? (Digite 0 para desistir)";
		
		do {
			String numeroString = JOptionPane.showInputDialog(null, mensagem);
			try {
				numeroPalpite = Integer.parseInt(numeroString);
				if (numeroPalpite > 0) {
					if(numeroSorteado < numeroPalpite) {
						mensagem = "Meu número é MENOR que este...Tente de novo.";
					}else if(numeroSorteado > numeroPalpite) {
						mensagem = "meu número é MAIOR que este... Tente de novo.";
					}
					tentativas++;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,  "Digite apenas número!");
			}
		} while(numeroPalpite != 0 && numeroPalpite != numeroSorteado);
		
		String resultado = (numeroPalpite == numeroSorteado ? "Acertou" : "Desistiu de acertar");
		
		JOptionPane.showMessageDialog(null,  "Você " + resultado + " o " + "número " + numeroSorteado + " depois de " + tentativas + " tentativa(s)");
	}

}
