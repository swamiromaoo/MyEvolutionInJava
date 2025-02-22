package aprendizado.meu.java.javacore.Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.15;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto Da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
