package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

	public static void main(String[] args) {
		double salarioPorAno = 400000, taxa;
		
		System.out.println("----Tabela de imposto na Holanda em 2026----");
		
		if(salarioPorAno < 38441) {
			taxa = 35.82;
		}else if(salarioPorAno >= 38441 && salarioPorAno < 76817) {
			taxa = 37.48;
		} else {
			taxa = 49.50;
		}
		System.out.println("A taxa que vc pagara de acordo com seu salário (€"+salarioPorAno+") você pagara uma taxa de "+taxa+"%.");
		
		double taxaPaga = salarioPorAno * (taxa/100);
		System.out.println("O tanto de taxa que você pagara é de €"+taxaPaga);
		
		double salarioLiquido = salarioPorAno - taxaPaga;
		System.out.println("O valor que você recebera liquído por ano é de €"+salarioLiquido);
	}

}
