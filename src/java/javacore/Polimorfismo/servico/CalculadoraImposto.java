package aprendizado.meu.java.javacore.Polimorfismo.servico;

import aprendizado.meu.java.javacore.Polimorfismo.dominio.Computador;
import aprendizado.meu.java.javacore.Polimorfismo.dominio.Produto;
import aprendizado.meu.java.javacore.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Valor R$" + produto.getValor());
        System.out.println("Imposto a ser pago R$" + +imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}

