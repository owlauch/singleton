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
        int x = 0;
        for (Aluno listAluno : listAlunos) {
            if (listAluno.getId() == aluno.getId()) {
                System.out.println("ID em USO");
                x++;
            }
        }
        if (x < 1) {
            this.listAlunos.add(aluno);
        }
    }

    public void deleteAluno(int id) {
        int x = 0;
        for (Aluno listAluno : listAlunos) {
            if (listAluno.getId() == id) {
                listAlunos.remove(listAluno);
            }
        }
        System.out.println("Deletado");
    }

}
