package java.javacore.Herenca.Test;

import pacote.meu.java.javacore.Bherenca.dominio.Endereco;
import pacote.meu.java.javacore.Bherenca.dominio.Funcionario;
import pacote.meu.java.javacore.Bherenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 78a");
        endereco.setCep("123456-78");
        Pessoa pessoa = new Pessoa("Naruto","676.767.676-77");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Kakashi");
        funcionario.setCpf("123.456.789-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("---------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();

    }
}
