package main.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singAlunos = Singleton.getSingleton();
        Aluno aluno = new Aluno("olivir",1);
        Aluno aluno2 = new Aluno("teste",1);
        Aluno aluno3 = new Aluno("teste",3);
        singAlunos.setAlunosList(aluno);
        singAlunos.setAlunosList(aluno2);
        singAlunos.deleteAluno(3);
        singAlunos.getAlunosList();
        System.out.println("---------------------");
        Main.outra();
        
    }
    
    public static void outra() {
        Singleton singAlunos = Singleton.getSingleton();
        Aluno aluno = new Aluno("outro aluno",2);
        singAlunos.setAlunosList(aluno);
        singAlunos.getAlunosList();
    }

}
