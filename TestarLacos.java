package Estudo;

public class TestarLacos {
	public static void main(String[] args) {
		for (int linha = 0; linha < 9; ++linha) {
			for (int coluna = 0; coluna <= linha; ++coluna) {
//				if (coluna > linha) {
//					break;
//				}
				System.out.print("*");

			}
			System.out.println("");
		}
		
	}
}
