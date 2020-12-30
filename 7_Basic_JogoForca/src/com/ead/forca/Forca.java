package com.ead.forca;

import java.util.Random;

public class Forca {

	private String[] palavras = new String[] { "CHUVA", "PASSARO", "LEKA", "ARVORE", "PISCINA", "ECLIPSE" };

	private String[] forcas = new String[7];

	private int erros;
	private int indicePalavraSorteada;
	private StringBuilder palavraExibida;

	public Forca() {
		erros = 0;
		Random random = new Random();
		indicePalavraSorteada = random.nextInt(palavras.length);
		palavraExibida = new StringBuilder(palavras[indicePalavraSorteada].replaceAll("[A-Z]", "-"));

		forcas[0] = "----- \n" 
				  + "|   | \n" 
				  + "    | \n" 
			 	  + "    | \n" 
			 	  + "    | \n" 
				  + "   === \n";

		forcas[1] = "----- \n" 
				  + "|   | \n" 
				  + "0   | \n" 
				  + "    | \n" 
				  + "    | \n" 
				  + "   === \n";

		forcas[2] = "----- \n" 
				  + "|   | \n" 
				  + "0   | \n" 
				  + "|   | \n" 
				  + "    | \n" 
				  + "   === \n";

		forcas[3] = "----- \n" 
				  + " |   | \n" 
				  + " 0   | \n" 
				  + "/|   | \n" 
				  + "     | \n" 
				  + "   === \n";

		forcas[4] = "----- \n" 
				  + " |   | \n" 
				  + " 0   | \n" 
				  + "/|\\ | \n" 
				  + "     | \n" 
				  + "   === \n";

		forcas[5] = "----- \n" 
				  + " |   | \n" 
				  + " 0   | \n" 
				  + "/|\\ | \n" 
				  + "/    | \n" 
				  + "   === \n";

		forcas[6] = "----- \n" 
				  + " |   | \n" 
				  + " 0   | \n" 
				  + "/|\\ | \n" 
				  + "/ \\ | \n" 
				  + "    === \n";
	}

	public String getEstagioEnforcamento() {
		return forcas[erros];
	}

	public StringBuilder getPalavraExibida() {
		return palavraExibida;
	}

	public void testarLetra(String letra) {
		if (palavras[indicePalavraSorteada].contains(letra)) {
			for (int i = 0; i < palavras[indicePalavraSorteada].length(); i++) {
				if (palavras[indicePalavraSorteada].charAt(i) == letra.charAt(0)) {
					palavraExibida.replace(i, i + 1, letra);
				}
			}
		} else {
			erros++;
		}
	}

	public int getErros() {
		return erros;
	}

	public String getPalavraSecreta() {
		return palavras[indicePalavraSorteada];
	}
}
