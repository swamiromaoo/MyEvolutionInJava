package aprendizado.meu.java.javacore.Polimorfismo.test;

import aprendizado.meu.java.javacore.Polimorfismo.repositorio.Repositorio;
import aprendizado.meu.java.javacore.Polimorfismo.servico.RepositorioArquivo;
import aprendizado.meu.java.javacore.Polimorfismo.servico.RepositorioBancoDeDados;
import aprendizado.meu.java.javacore.Polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
