package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime("Grand Blue", "TV", 24,"Comédia");
		new Anime();
		//anime.init("Grand Blue", "TV", 24,"Comédia");
		Anime anime2 = new Anime();
		anime.imprime();
		anime2.imprime();
	}
}
