package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.*;

public class FuncionarioTest01 {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Nami", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Franky", 3000);
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		gerente.imprime();
		desenvolvedor.imprime();
	}
}
