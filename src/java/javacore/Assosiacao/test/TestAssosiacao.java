package aprendizado.meu.java.javacore.Assosiacao.test;

import aprendizado.meu.java.javacore.Assosiacao.dominio.Aluno;
import aprendizado.meu.java.javacore.Assosiacao.dominio.Local;
import aprendizado.meu.java.javacore.Assosiacao.dominio.Professsor;
import aprendizado.meu.java.javacore.Assosiacao.dominio.Seminario;

public class TestAssosiacao {
    public static void main(String[] args) {
        Local local = new Local("AV. Paulista");
        Aluno aluno = new Aluno("Naruto",19);
        Professsor professor = new Professsor("Jirarya","Tarado");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como conquistar mulher",alunosParaSeminario,local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}
