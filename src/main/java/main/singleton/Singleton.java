package main.singleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    List<Aluno> listAlunos = new ArrayList<Aluno>();
    public static Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return INSTANCE;
    }

    public void getAlunosList() {
        this.listAlunos.forEach((arg0) -> {
            System.out.println(arg0.getNome());
        });
    }

    public void setAlunosList(Aluno aluno) {
        this.listAlunos.add(aluno);
    }

}
