package aprendizado.meu.java.javacore.Polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.20;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto Do Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
