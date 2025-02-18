package aprendizado.meu.java.javacore.Enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa Fisica"),
    PESSOA_JURIDICA("Pessoa Juridica");

    private String nomeRelatorio;
    TipoCliente(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio))return tipoCliente;
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
