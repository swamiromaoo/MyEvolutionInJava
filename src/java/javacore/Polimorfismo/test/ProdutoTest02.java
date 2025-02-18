package aprendizado.meu.java.javacore.Polimorfismo.test;

import aprendizado.meu.java.javacore.Polimorfismo.dominio.Computador;
import aprendizado.meu.java.javacore.Polimorfismo.dominio.Produto;
import aprendizado.meu.java.javacore.Polimorfismo.dominio.Televisao;
import aprendizado.meu.java.javacore.Polimorfismo.dominio.Tomate;
import aprendizado.meu.java.javacore.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("MacBook Chip M1",8000);

        Tomate tomate = new Tomate("Americano",15);
        tomate.setDataValidade("11/03/25");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(produto1);


    }
}
