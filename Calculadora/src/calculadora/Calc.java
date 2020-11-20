package calculadora;

import javax.swing.JOptionPane;

public class Calc {

	public static void main(String[] args) {
		
//		O programa dever� executar as seguintes etapas:
//
//			Obter o primeiro n�mero. Caso o usu�rio digite caracteres inv�lidos, ser� exibido um aviso e atribu�do 0 ao valor.
//			Obter o segundo n�mero, fazendo a mesma valida��o realizada para o primeiro.
//			Calcular soma, subtra��o, divis�o e multiplica��o desses n�meros.
//			Montar uma string que exiba os resultados das quatro opera��es.
//			Exibir a string ao usu�rio em uma janela.

		double valor1 = 0;
		double valor2 = 0;
		double soma, sub, mult, div;

		String valorStr;

		try {
			valorStr = JOptionPane.showInputDialog(null, "Informe o primeiro n�mero: ");
			valor1 = Double.parseDouble(valorStr);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido. Considerando 0 para o n�mero 1.");
		}

		try {
			valorStr = JOptionPane.showInputDialog(null, "Informe o segundo n�mero: ");
			valor2 = Double.parseDouble(valorStr);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido. Considerando 0 para o n�mero 2.");
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