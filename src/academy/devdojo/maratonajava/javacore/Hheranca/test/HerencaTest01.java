package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.*;

public class HerencaTest01 {
	
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 67");
		endereco.setCep("012345-678");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Eishiro Oda");
		pessoa.setCpf("128.915.572.02");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		System.out.println("--------------");
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Masashi Kishimoto");
		funcionario.setCpf("222.367.985.46");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(4974.48);
		funcionario.imprime();
	}
}
