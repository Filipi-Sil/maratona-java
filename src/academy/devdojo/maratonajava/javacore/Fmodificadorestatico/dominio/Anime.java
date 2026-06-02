package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
	private String nome;
	private static int[] episodios;
	
	static {
		System.out.println("Blocos de inicialização estatico");
		episodios = new int[100];
		for(int i = 0; i < episodios.length; i++) {
			episodios[i] = i+1;
		}
	}
	
	static {
		System.out.println("Blocos de inicialização estatico 2");
	}
	
	{
		System.out.println("Blocos de inicialização");

	}
	
	public Anime() {
		for(int episodio:Anime.episodios) {
			System.out.print(episodio+" ");
		}
		System.out.println();

	}


	public Anime(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}
	
	
}
