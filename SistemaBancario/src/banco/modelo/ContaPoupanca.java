package banco.modelo;

public class ContaPoupanca extends Conta {
	
	private int aniversario;
	private double rendimento;
	

	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		aniversario = 1;
		rendimento = 6.0;
	}

	public ContaPoupanca(Cliente cliente, int aniversario, double rendimento) {
		super(cliente);
		this.aniversario = aniversario;
		this.rendimento = rendimento;
	}

	public void aplicaRendimento() {
		if(saldo > 0) {
			saldo = saldo +(saldo * rendimento/100);
		}
		
	}

}
