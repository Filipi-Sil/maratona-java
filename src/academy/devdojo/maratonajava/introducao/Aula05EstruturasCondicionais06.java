package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {

	public static void main(String[] args) {
	// dados os valores de um a 7, imprima se é dia util ou final de semana, considerando 1 domingo

		int dia = 8;
		
		switch(dia) {
			case 1,7:
				System.out.println("Final de Semana");
				break;
			case 2,3,4,5,6:
				System.out.println("Dia útil");
				break;
			default:
				System.out.println("Por favor insira um dia valido");
				break;
		}
	}

}
