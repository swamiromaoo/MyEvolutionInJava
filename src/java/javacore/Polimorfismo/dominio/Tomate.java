package aprendizado.meu.java.javacore.Polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.05;
    private String DataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto Do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }
}
