package java.javacore.Assosiacao.test;

import pacote.meu.java.javacore.Assosiacao.dominio.Aluno;
import pacote.meu.java.javacore.Assosiacao.dominio.Local;
import pacote.meu.java.javacore.Assosiacao.dominio.Professor;
import pacote.meu.java.javacore.Assosiacao.dominio.Seminario;

public class AssosiacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("AV. Paulista");
        Aluno aluno = new Aluno("Naruto",19);
        Professor professor = new Professor("Jirarya","Tarado");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como conquistar mulher",alunosParaSeminario,local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}
