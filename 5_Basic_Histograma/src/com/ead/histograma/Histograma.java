package com.ead.histograma;

import java.util.Random;

import javax.swing.JOptionPane;

public class Histograma {

	public static void main(String[] args) {

		Random random = new Random();
		int histograma[] = new int[10];
		StringBuilder construtorDeString = new StringBuilder();

		construtorDeString.append("HISTOGRAMA\n");

		for (int i = 0; i < 100; i++) {
			histograma[random.nextInt(10)]++;
		}

		for (int i = 0; i < 10; i++) {
			construtorDeString.append((i + 1) + ": ");
			for (int j = 0; j < histograma[i]; j++)
				construtorDeString.append("#");
			construtorDeString.append("\n");
		}

		JOptionPane.showMessageDialog(null, construtorDeString);
	}

}
