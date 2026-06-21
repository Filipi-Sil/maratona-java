package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pelé");
		Jogador jogador2 = new Jogador("Rodrygo");
		Time time = new Time("Santos");
		Time time2 = new Time("Real Madrid");
		
		jogador1.setTime(time);
		jogador2.setTime(time2);
		jogador1.imprime();
		jogador2.imprime();
	}
}
