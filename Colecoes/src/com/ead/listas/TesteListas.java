package com.ead.listas;

import java.util.ArrayList;

public class TesteListas {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
			nomes.add("Camila");
			nomes.add("Rosana");
			
			
			for (int i = 0; i < nomes.size(); i++) {
				String nome = nomes.get(i);
				System.out.println(nome);	
				
			}
					
	}
}
