package aprendizado.meu.java.javacore.Interface.dominio;

public class Fileloader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from a file...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }
    @Override
    public void checkpermission() {
        System.out.println("Checando permissoes de arquivos");
    }
}
