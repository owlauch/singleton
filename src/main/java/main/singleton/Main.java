package main.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singAlunos = Singleton.getSingleton();
        Aluno aluno = new Aluno("olivir");
        singAlunos.setAlunosList(aluno);
        singAlunos.getAlunosList();
        System.out.println("---------------------");
        Main.outra();
        
    }
    
    public static void outra() {
        Singleton singAlunos = Singleton.getSingleton();
        Aluno aluno = new Aluno("outro aluno");
        singAlunos.setAlunosList(aluno);
        singAlunos.getAlunosList();
    }

}
