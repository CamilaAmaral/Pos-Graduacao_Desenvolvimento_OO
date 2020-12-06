package banco.modelo;

public class Cliente {

	public int codigo;
	public String nome;
	public String cidade;
	public String estado;

	static int quantidade;

	public Cliente() {
		quantidade++;
		codigo = quantidade;
		nome = "INDEFINIDO";
		cidade = "S�o Paulo";
		estado = "S�o Paulo";
	}

	public Cliente(String nome, String cidade, String estado) {
		quantidade++;
		codigo = quantidade;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String listarDados() {
		return "C�DIGO: " + codigo + "\n" + "NOME: " + nome + "\n" + "CIDADE: " + cidade + "\n" + "ESTADO: " + estado;
	}

	public static int qtdClientes() {
		return quantidade;
	}

}
