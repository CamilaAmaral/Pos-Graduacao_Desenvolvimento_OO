package banco.modelo;

import java.text.DecimalFormat;

public class Conta {

	protected int numero;
	protected Cliente cliente;
	protected Double saldo;

	private static int contador;

	public Conta(Cliente cliente) {
		contador++;
	}

	public Conta(int numero, Cliente cliente, Double saldo) {
		super();
		contador++;
		numero = contador;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String listarDados() {
		return "NÚMERO: " + numero + "\n"
				+ "CLIENTE: " + cliente + "\n"
				+ "SALDO: " + saldo + "\n";
	}

	public String getSaldoFormatado() {
		return DecimalFormat.getCurrencyInstance().format(saldo);
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

}
