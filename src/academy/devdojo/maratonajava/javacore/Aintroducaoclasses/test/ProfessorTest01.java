package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.idade = 42;
		professor.nome = "Crocodille";
		professor.sexo = 'U';
		System.out.println("Idade: "+professor.idade+". Nome: "+professor.nome+". Sexo: "+professor.sexo);
	}

}
