package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		
		int age = (int) 10000000000L;
		long numeroGrande = 10000L;
		double salarioDouble = 2000.0D;
		float salarioFloat = 2500.0F;
		byte idadeByte = 127;
		short idadeShort = 32000;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = 87;
		String nome = "Filipi";
		var bla = true;
		
		System.out.println("a idade é "+age+ " anos");
		System.out.println(caractere);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println(idadeShort);
		System.out.println(idadeByte);
		System.out.println(salarioFloat);
		System.out.println(salarioDouble);
		System.out.println(numeroGrande);
		System.out.println("Olá meu nome é "+nome);
	}
}
