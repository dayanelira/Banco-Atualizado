package Programa;

public class Cliente {
	
	private static int counter = 1;
	
	private String nome;
	private String cpf;

	public Cliente() {

	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		counter += 1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "\nNome: " + this.getNome() +
			   "\ncpf: " + this.getCpf();
		}
	
}
