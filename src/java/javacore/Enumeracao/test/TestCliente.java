package aprendizado.meu.java.javacore.Enumeracao.test;

import aprendizado.meu.java.javacore.Enumeracao.dominio.Cliente;
import aprendizado.meu.java.javacore.Enumeracao.dominio.TipoCliente;
import aprendizado.meu.java.javacore.Enumeracao.dominio.TipoPagamento;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("McLaren", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Ferrari", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);


    }
}
