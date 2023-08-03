package CursoJavaLoiane;

public class Teste {

	public static void main(String[] args) {
		usandoConstantes();
		System.out.println("-------");
		usandoEnum();
	}
	
	private static void usandoConstantes() {
		int domingo = DiaSemanaConstante.DOMINGO;
		int segunda = DiaSemanaConstante.SEGUNDA;
		int terca = DiaSemanaConstante.TERCA;
		int quarta = DiaSemanaConstante.QUARTA;
		int quinta = DiaSemanaConstante.QUINTA;
		int sexta = DiaSemanaConstante.SEXTA;
		int sabado = DiaSemanaConstante.SABADO;
		
		System.out.println("Teste utilizando constantes no Java");
		imprimeDiaSemana(domingo);
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
	}
	
	private static void imprimeDiaSemana(int dia) {
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		}
	}
	
	private static void usandoEnum() {
		DiaSemana domingo = DiaSemana.DOMINGO;
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		
		System.out.println("Utilizando Enum no Java");
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch(dia) {
		case DOMINGO:
			System.out.println("Domingo");
			break;
		case SEGUNDA:
			System.out.println("Segunda-Feira");
			break;
		case TERCA:
			System.out.println("Terça-Feira");
			break;
		case QUARTA:
			System.out.println("Quarta-Feira");
			break;
		case QUINTA:
			System.out.println("Quinta-Feira");
			break;
		case SEXTA:
			System.out.println("Sexta-Feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		}
	}
}
