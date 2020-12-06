package banco.modelo;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	private String razaoSocial;

	public PessoaJuridica() {
		super();
		razaoSocial = "INDEFINIDO";
		cnpj = "";
	}
	
	public PessoaJuridica(String cidade, String estado, String cnpj, String razaoSocial) {
		super(cidade, estado);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String listarDados() {
		return "RAZ�O SOCIAL: " + razaoSocial + "\n" 
				+ "CNPJ: " + cnpj + "\n" 
				+ super.listarDados();
	}
}
