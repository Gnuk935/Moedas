package moedas.calculo;

import java.util.Scanner;

import moedas.qual.Valores;
import moedas.view.Tela;

public class Calcular {
	private static int x;

// Clase para cacular as moedas
	public static void main(String[] args) {
		Valores v = new Valores(); // Define os valores
		Tela view = new Tela(); // A tela
		
		
		try (Scanner s = new Scanner(System.in)) {
			view.inicio(); // Link start

			/*
			 * Começa a brincadeira
			 */

			view.defineN(); // numero de colunas
			v.setN(s.nextInt());

			view.defineR(); // numero de linhas
			v.setR(s.nextInt());

			// Confirmação sobre A
			view.sobreA();
			x = s.nextInt();
			if (x == 1) {
				view.defineA();
				v.setA(s.nextInt());
			}
		}

		view.espaco(); // Apenas um espaço kk
		v.setnR(v.getN() * v.getR() - v.getA()); // Seta o valor de numero real
		
		v.setnRc(v.getnR() * 0.5); //Cinco centavos
		v.setnRd(v.getnR() * 0.10); //Dez centavos
		v.setnRv(v.getnR() * 0.25); // Vinte e cinco centavos
		v.setnRcc(v.getnR() * 0.50); //Cinquenta centavos
		v.setnRu(v.getnR() * 1); // Um real
		
		//Calculo final
		
		v.setresultado(v.getnRc() + v.getnRd() + v.getnRv() + v.getnRcc() + v.getnRu());
		
		view.esp();
		view.fim();
		

	}
	

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Calcular.x = x;
	}
}
