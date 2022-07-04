package Pessoas;

public class Pessoa {
	String nome;
	int idade;

	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	Pessoa(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
