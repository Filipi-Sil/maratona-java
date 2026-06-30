package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.*;

public class ProfessorTest01 {

	public static void main(String[] args) {
		Local local = new Local("Konoha");
		
		Professor professor = new Professor("Shikamaru","Esquadrão de Inteligência");
		
		Aluno aluno01 = new Aluno ("Naruto", 16);
		Aluno aluno02= new Aluno ("Sakura", 15);
		Aluno aluno03 = new Aluno ("Sasuke", 16);
		Aluno aluno04 = new Aluno ("Konohamaru", 12);
		Aluno aluno05 = new Aluno ("Moegi", 13);
		Aluno aluno06 = new Aluno ("Udon", 12);
		Aluno alunosChunin[] = {aluno01,aluno02,aluno03};
		Aluno alunosGenin[] = {aluno04,aluno05,aluno06};
		
		Seminario seminario01 = new Seminario("Exame Chunin",alunosChunin,local);
		Seminario seminario02 = new Seminario("Exame Genin",alunosGenin,local);
		Seminario[] seminarios = {seminario01,seminario02};
		
		professor.setSeminarios(seminarios);
		
		professor.imprime();
		;
	}

}
