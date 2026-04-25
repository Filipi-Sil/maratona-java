package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
	public static void main(String[] args) {
	Carro carro1 = new Carro();
	Carro carro2 = new Carro();
	carro1.nome = "Chevrolet Onix";
	carro1.modelo = "Sedan";
	carro1.ano = 2020;
	carro2.nome = "Ford Focus";
	carro2.modelo = "Hatch";
	carro2.ano = 2013;
	System.out.println("O primeiro carro é um "+carro1.nome+" do modelo "+carro1.modelo+" do ano de "+carro1.ano);
	System.out.println("O segundo carro é um "+carro2.nome+" do modelo "+carro2.modelo+" do ano de "+carro2.ano);

	}
}
