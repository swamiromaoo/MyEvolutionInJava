package java.javacore.ModificadorFinal.test;

import pacote.meu.java.javacore.ModificadorFinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Steve");
        System.out.println(carro.COMPRADOR);
    }
}
