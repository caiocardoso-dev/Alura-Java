package Estudo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar.");
			} else {
				System.out.println("Infelizmente voce n�o pode entrar");
			}
			
		}
	}
}
