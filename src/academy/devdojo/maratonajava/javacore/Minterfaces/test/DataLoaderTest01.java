package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.*;

public class DataLoaderTest01 {
	public static void main(String[] args) {
		DatabaseLoader databaseloader = new DatabaseLoader();
		FileLoader fileloader = new FileLoader();
		databaseloader.load();
		fileloader.load();
	}
}
