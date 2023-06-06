package ProjetosJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecao {

	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Numero: ");
			int a = entrada.nextInt();
			System.out.print("Divisor: ");
			int b = entrada.nextInt();
			
			System.out.println(a/b);
		}
		catch(InputMismatchException e1){
			System.out.println("Erro de InputMismatchException capturado!");
		}
		catch(Throwable e2) {
			System.out.println("Erro de ArithmaticException capturado!");
		}
	}

}
