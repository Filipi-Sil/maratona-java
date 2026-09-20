package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Rintarou",TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);	 
		Cliente cliente2 = new Cliente("Usami",TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);	 
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
		TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente);
		TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
		System.out.println(tipoCliente2);
	}
}
