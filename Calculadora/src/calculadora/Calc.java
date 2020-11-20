package calculadora;

import javax.swing.JOptionPane;

public class Calc {

	public static void main(String[] args) {
		
//		O programa deverá executar as seguintes etapas:
//
//			Obter o primeiro número. Caso o usuário digite caracteres inválidos, será exibido um aviso e atribuído 0 ao valor.
//			Obter o segundo número, fazendo a mesma validação realizada para o primeiro.
//			Calcular soma, subtração, divisão e multiplicação desses números.
//			Montar uma string que exiba os resultados das quatro operações.
//			Exibir a string ao usuário em uma janela.

		double valor1 = 0;
		double valor2 = 0;
		double soma, sub, mult, div;

		String valorStr;

		try {
			valorStr = JOptionPane.showInputDialog(null, "Informe o primeiro número: ");
			valor1 = Double.parseDouble(valorStr);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Número inválido. Considerando 0 para o número 1.");
		}

		try {
			valorStr = JOptionPane.showInputDialog(null, "Informe o segundo número: ");
			valor2 = Double.parseDouble(valorStr);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Número inválido. Considerando 0 para o número 2.");
		}

		soma = valor1 + valor2;
		sub = valor1 - valor2;
		mult = valor1 * valor2;
		div = valor1 / valor2;

		StringBuilder resposta = new StringBuilder();
		resposta.append(valor1 + " + " + valor2 + " = " + soma + "\n");
		resposta.append(valor1 + " - " + valor2 + " = " + sub + "\n");
		resposta.append(valor1 + " * " + valor2 + " = " + mult + "\n");
		resposta.append(valor1 + " / " + valor2 + " = " + div + "\n");

		JOptionPane.showMessageDialog(null, resposta);

	}

}