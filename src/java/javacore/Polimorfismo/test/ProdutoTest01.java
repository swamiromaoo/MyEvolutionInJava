package aprendizado.meu.java.javacore.Polimorfismo.test;

import aprendizado.meu.java.javacore.Polimorfismo.dominio.Computador;
import aprendizado.meu.java.javacore.Polimorfismo.dominio.Televisao;
import aprendizado.meu.java.javacore.Polimorfismo.dominio.Tomate;
import aprendizado.meu.java.javacore.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("iMac Pro Chip M3",15000);
        Tomate tomate = new Tomate("Tomate Ciciliano",10);
        Televisao televisao = new Televisao("TV Samsung 65\"",4000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);


    }
}
