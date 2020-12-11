package banco.modelo;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta {
	
	private Double limite;
	private Double juros;
	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		limite = 1000.0;
		juros = 5.9;
	}

	public ContaCorrente(Cliente cliente, Double limite, Double juros) {
		super(cliente);
		this.limite = limite;
		this.juros = juros;
	}
	
	@Override
	public String getSaldoFormatado() {
		return DecimalFormat.getCurrencyInstance().format(saldo + limite); 
	}
	
	@Override
	public boolean sacar(double valor) {
		if(saldo + limite >= valor) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
//	verificar erro listarDados está voltando null
	@Override
	public String listarDados() {
		String nome;
		if(cliente instanceof PessoaFisica) {
			nome = ((PessoaFisica)cliente).getNome();
		}else {
			nome = ((PessoaJuridica)cliente).getRazaoSocial();
		}
		return "NUMERO: " + numero + "\n"
				+ "CORRENTISTA: " +	nome + "\n"
				+ "SALDO: " + DecimalFormat.getCurrencyInstance().format(saldo + limite);
	}
	
	private void aplicarJuros() {
		if (saldo < 0) {
			saldo = saldo - (saldo * juros / 100);
		}
	}

}
