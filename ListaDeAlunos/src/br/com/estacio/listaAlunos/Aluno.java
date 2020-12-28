package br.com.estacio.listaAlunos;

public class Aluno implements Comparable<Aluno> {

	private int rm;
	private String nome;
	private String curso;
	
	public Aluno(int rm, String nome, String curso) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.curso = curso;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "[" + rm + " - " + nome + " - " + curso + "]";
	}
	
	@Override
	public int compareTo(Aluno arg0) {
		return this.nome.compareTo(arg0.nome);
	}
}
