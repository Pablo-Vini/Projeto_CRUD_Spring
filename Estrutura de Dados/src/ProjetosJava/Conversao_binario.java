package ProjetosJava;

import java.util.Scanner;

public class Conversao_binario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valorint;
		String valorbin;
		String div = "";
		
		System.out.println("0 - Conversor de Decimal para Binário");
		System.out.println("1 - Conversor de Binario para Decimal");
		System.out.print("==> ");
		if(scan.nextInt() == 0) {
			System.out.print("Digite o valor Decimal: ");
			valorint=scan.nextInt();
			
			while(valorint > 0) {
				if(valorint % 2 == 0) {
					div = div + "0";
					valorint = valorint / 2;
				}
				else {
					div = div + "1";
					valorint = valorint / 2;
				}
			}
			String resul = new StringBuffer(div).reverse().toString();
			System.out.println("Valor em Binário  " + resul);
			
			
		}
		else if(scan.nextInt() == 1) {
			System.out.print("Digite o valor Binário: ");
			
			
		}
		else {
			System.out.println("\n\nEscolha uma opção válida!\n\n");
		}
	}

}
