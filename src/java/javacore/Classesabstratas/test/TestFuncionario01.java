package aprendizado.meu.java.javacore.Classesabstratas.test;

import aprendizado.meu.java.javacore.Classesabstratas.dominio.Desenvolvedor;
import aprendizado.meu.java.javacore.Classesabstratas.dominio.Gerente;


public class TestFuncionario01 {
    public static void main(String[] args) {
        Gerente gerente  = new Gerente("Pain",5000);
        Desenvolvedor desenvolvedor  = new Desenvolvedor("Obito",20000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();





    }
}
