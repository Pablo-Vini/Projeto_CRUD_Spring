package ProjetosJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		
		do {
			try {
				System.out.print("Numero: ");
				int a = entrada.nextInt();
				System.out.print("Divisor: ");
				int b = entrada.nextInt();
			
				System.out.println(a/b);
			}
			catch(InputMismatchException e1){
				System.err.println("Erro de InputMismatchException capturado!");
			}
			catch(Throwable e2) {
				System.err.println("Erro de ArithmaticException capturado!");
			}
			finally {
				System.out.println("Finally executado...");
			}
		}while(continuar);
	}

}
