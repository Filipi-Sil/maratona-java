package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		// + - / *
		System.out.println("-Operadores Aritiméticos-");
		double num1 = 10;
		int num2 = 20;
		double resul = num1 / num2;
		System.out.println(resul);
		
		// %
		System.out.println("-Operador Resto-");
		int resto = 8 % 2;
		System.out.println(resto);
		
		// < > <= >= == !=
		System.out.println("-Operadores Relacionais-");;
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezDiferenteVinte = 10 != 20;
		System.out.println(isDezMaiorQueVinte);
		System.out.println(isDezMenorQueVinte);
		System.out.println(isDezIgualVinte);
		System.out.println(isDezDiferenteVinte);
		
		// && || !
		System.out.println("-Operadores Logicos-");
		int idade = 29;
		float salario = 3400F;
		boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
		boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
		System.out.println("Você está dentro da lei maior que 30? "+isDentroDaLeiMaiorQue30);
		System.out.println("Você está dentro da lei menor que 30? "+isDentroDaLeiMenorQue30);
		
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000;
		boolean isPlaystationCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
		
		System.out.println("Você pode comprar um Playstation? "+isPlaystationCompravel);
		
		//= += -= *= /= %=
		System.out.println("-Operadores de Atribuição-");
		double bonus = 1800;//1800
		bonus += 1000;//2800
		bonus -= 1000;//1800
		bonus *= 2;//3600
		bonus /= 2;//1800
		bonus %= 2;//0
		System.out.println(bonus);	
		
		//++ --
		System.out.println("-Operadores Unarios-");
		int contador = 0;
		contador++;
		contador--;
		++contador;
		--contador;
		System.out.println(contador);
		int contador2 = 0;
		System.out.println(contador2++);
		System.out.println(contador2);
		System.out.println(--contador2);
		;
		
	}
}
