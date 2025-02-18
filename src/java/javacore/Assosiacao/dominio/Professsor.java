package aprendizado.meu.java.javacore.Assosiacao.dominio;

public class Professsor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professsor(String nome) {
        this.nome = nome;
    }

    public Professsor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println("Professor "+ this.nome);
        System.out.println("## Seminario cadastrados ##");
        if(this.seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) continue;
            System.out.println("## Alunos ##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + "\nIdade: "+ aluno.getIdade());
            }

        }

    }


    public Professsor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


