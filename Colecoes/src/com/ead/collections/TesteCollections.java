package com.ead.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TesteCollections {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Rodrigo");
		lista.add("Rosana");
		lista.add("Camila");
		
		Collections.sort(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			String nome = lista.get(i);
			System.out.println(nome);	
			
		}

	}

}
