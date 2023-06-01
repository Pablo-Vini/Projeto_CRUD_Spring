package ProjetosJava;

import java.util.Scanner;

public class Vetores {

	public Vetores() {
		
	}

	public static void main(String[] args) {
		System.out.println("Vetores Java...");
		Scanner entrada = new Scanner(System.in);
		String[] lista = new String[100];
		int i=0, op=0;
		
		while(true) {
			System.out.println("1 - Inserir um nome");
			System.out.println("2 - Confira a lista de nomes ");
			System.out.println("3 - Remover da lista");
			System.out.println("4 - Sair");
			System.out.print("==> ");
			op = entrada.nextInt();
			
			if(op == 1) {
				System.out.print("Nome: ");
				lista[i] = entrada.next();
			}
			else if(op == 2) {
				
				System.out.print("Digite o nome para remover: ");
				
				
			}
			else if(op == 3) {
				for(int l=0;l<lista.length;l++) {
					if(lista[l]==null)
						break;
					System.out.println(lista[l]);
				}
				
			}
			else if(op == 4) {
				System.out.println("Saindo...");
				break;
			}
			else {
				System.out.println("Insira uma opção válida!");
			}
			
			
			i++;
		}

	}

}
