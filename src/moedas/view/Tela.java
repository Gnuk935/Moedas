package moedas.view;

public class Tela {
	public void inicio() {
		System.out.println("========================================================================");
		System.out.println("Olá! Este é um sistema basico de contagem de moedas");
		System.out.println("Para fazer a contagem defina os valores de:");
		System.out.println("n = linha");
		System.out.println("r = coluna");
		System.out.println("a = este valor é para o caso de não ter uma coluna ou linha incompleta");
		System.out.println("========================================================================");
		System.out.println("Por exemplo: 63 moedas de 10 centavos");
		System.out.println("Então eu as organizo em 8 colunas por 8 linhas, menos 1 linha pois falta uma moeda para fechar a coluna");
		System.out.println("Ou seja n = 8 r = 8 a = 1");
	}
	
	public void defineN() {
		System.out.println("Informe o valor de n (numero de colunas)");
	}
	
	public void defineR() {
		System.out.println("Informe o valor de r (numero de linhas)");
	}
	
	public void defineA() {
		System.out.println("Informe o valor de a (deixe 0 caso não tenha");
	}
	
	public void espaco(){
		System.out.println(" ");
		System.out.println("========================================================================");
		System.out.println(" ");
	}
	
	public void esp() {
		System.out.println("Estamos calculando, aguarde...");
	}
	
	//TODO fazer a aba de resultado quando necessario!
}
