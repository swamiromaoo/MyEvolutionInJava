package aprendizado.meu.java.javacore.Interface.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkpermission(){
        System.out.println("Fazendo Checagem de permissoes");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interFace");
    }
}
