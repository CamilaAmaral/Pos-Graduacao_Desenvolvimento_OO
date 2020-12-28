package com.ead.set;

import java.util.HashSet;

public class TesteConjuntos {

	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<String>();
		nomes.add("Camila");
		nomes.add("Rosana");
		nomes.add("Camila");
		
	for (String nome : nomes) {
		System.out.println(nome);
	}

	}

}
