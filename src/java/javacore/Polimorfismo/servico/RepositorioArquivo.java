package aprendizado.meu.java.javacore.Polimorfismo.servico;

import aprendizado.meu.java.javacore.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
