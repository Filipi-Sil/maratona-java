package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
	

	public static void main(String[] args) {
		//byte, short, int, float, long, double 0
		//char '\u0000' == ' '
		//boolean false
		//String null
		
		String [] nomes = new String[4];
		nomes = new String[8];
		
		nomes[0] = "Sanji";
		nomes[1] = "Shikamaru";
		nomes[2] = "Tomioka";
		nomes[3] = "Crocodile";
		
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		

	}

}
