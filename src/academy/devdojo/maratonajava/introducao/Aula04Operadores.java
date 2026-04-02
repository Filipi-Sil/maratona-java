package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		// + - / *
		System.out.println("Operadores Aritiméticos");
		double num1 = 10;
		int num2 = 20;
		double resul = num1 / num2;
		System.out.println(resul);
		
		// %
		System.out.println("Operador Resto");
		int resto = 8 % 2;
		System.out.println(resto);
		
		// < > <= >= == !=
		System.out.println("Operadores Logicos");
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezDiferenteVinte = 10 != 20;
		System.out.println(isDezMaiorQueVinte);
		System.out.println(isDezMenorQueVinte);
		System.out.println(isDezIgualVinte);
		System.out.println(isDezDiferenteVinte);
	}
}
