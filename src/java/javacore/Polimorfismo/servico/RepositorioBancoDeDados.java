package aprendizado.meu.java.javacore.Polimorfismo.servico;

import aprendizado.meu.java.javacore.Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
