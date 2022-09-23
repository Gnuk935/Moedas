package moedas.calculo;

import java.util.Scanner;

import moedas.numero.Valor;
import moedas.qual.CincoC;
import moedas.qual.CinquentaC;
import moedas.qual.DezC;
import moedas.qual.UmR;
import moedas.qual.VinteC;

public class Calcular {
	private static CincoC c;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		
		c = new CincoC();
		CinquentaC cc = new CinquentaC();
		DezC d = new DezC();
		UmR u = new UmR();
		VinteC v = new VinteC();
		
		//Valor
		Valor n = new Valor();
		Valor res = new Valor();
		 
		//Ver um modo mais eficiente para coletar mais valores de uma vez
		System.out.println("Selecione as moeda");
		System.out.println("Digite a letra referente a moeda");
		System.out.println("A) 5 centavos");
		System.out.println("B) 10 centavos");
		System.out.println("C) 25 centavos");
		System.out.println("D) 50 centavos");
		System.out.println("E) 1 real");
		s.next();
		System.out.println("Digite o numero de moedas");
		n.setValor(num.nextInt());
		
		System.out.println("Aguarde um momento!");
		
		if(s.equals(A)) {
			res.setValor(c.getVCinco() * n.getValor());
		}
	}
	
	
	
	
		
}
