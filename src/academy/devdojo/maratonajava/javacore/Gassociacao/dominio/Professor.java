package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	
	public Professor(String nome) {
		this.nome = nome;
	}

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Professor(String nome, String especialidade, Seminario[] seminarios) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
	}
	
	public void imprime() {
		System.out.println("## Professor: "+this.nome+" ##");
		System.out.println("## Especialidade: "+this.especialidade+" ##");
		System.out.println("-------Seminários-------");
		if(this.seminarios == null) {
			System.out.println("Esse professor não ministra nenhum seminário");
			return;
		}
		for(Seminario seminario:this.seminarios) {
			System.out.println("***Seminário: " +seminario.getTitulo()+" ***");
			System.out.println("Endereço: "+seminario.getLocal().getEndereco());
			System.out.println("::: Alunos :::");
			if(seminario.getAlunos() == null) {
				System.out.println("Esse seminário não possue alunos.");
				continue;
			}
			for(Aluno aluno:seminario.getAlunos()) {
				System.out.print("Aluno: "+aluno.getNome()+"  ");
				System.out.println("Idade: "+aluno.getIdade());
			}
			
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	
	
}
