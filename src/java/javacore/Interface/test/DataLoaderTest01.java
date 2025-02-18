package aprendizado.meu.java.javacore.Interface.test;

import aprendizado.meu.java.javacore.Interface.dominio.DataBaseLoader;
import aprendizado.meu.java.javacore.Interface.dominio.DataLoader;
import aprendizado.meu.java.javacore.Interface.dominio.Fileloader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        Fileloader fileloader = new Fileloader();
        dataBaseLoader.load();
        fileloader.load();

        dataBaseLoader.remove();
        fileloader.remove();

        dataBaseLoader.checkpermission();
        fileloader.checkpermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
