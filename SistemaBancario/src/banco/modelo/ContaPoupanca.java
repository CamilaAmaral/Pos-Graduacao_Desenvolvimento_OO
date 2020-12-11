package banco.modelo;

import java.util.Calendar;

public class ContaPoupanca extends Conta {
	
	private int aniversario;
	private double rendimento;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		aniversario = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		rendimento = 5.2;
	}

	public ContaPoupanca(Cliente cliente, int aniversario, double rendimento) {
		super(cliente);
		this.aniversario = aniversario;
		this.rendimento = rendimento;
	}
	
	public boolean sacar (double valor) {
		int hoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		if((hoje > aniversario) && (saldo >= valor)) {
			saldo -=valor;
			return true;
		}else {
			return false;
		}
	}

	public void aplicarRendimento() {
		if(aniversario == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
			saldo = saldo +(saldo * rendimento / 100);
		}
	}
}
