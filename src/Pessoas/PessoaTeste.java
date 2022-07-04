package Pessoas;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		String resposta;

		System.out.println(" Voce gostaria de inserir nome e idade ou apenas a idade ? [I,N] ");
		resposta = leitor.next();

		if (resposta.equalsIgnoreCase("I")) {
			System.out.println("Informe a sua idade! : ");
			Pessoa pessoa = new Pessoa(Integer.parseInt(leitor.next()));
			System.out.println("Sua idade é " + pessoa.getIdade());

		}

		else if (resposta.equalsIgnoreCase("n")) {
			String nome;
			int idade;
			System.out.println("Informe seu nome:");
			nome = leitor.next();
			System.out.println(" Qual a sua idade? ");
			idade = Integer.parseInt(leitor.next());
			Pessoa pessoa = new Pessoa(nome, idade);
			System.out.println("Seu nome é:" + pessoa.getNome());
			System.out.println("Sua idade é: " + pessoa.getIdade());

		} else if (!resposta.equalsIgnoreCase("n") || !resposta.equalsIgnoreCase("n")) {
			System.out.println("Voce não digitou uma letra Correspondente !");

		}

	}

}
