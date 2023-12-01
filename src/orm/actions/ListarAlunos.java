package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import orm.modelo.Aluno;

public class ListarAlunos {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        TypedQuery<Aluno> query = manager.createQuery("SELECT a FROM Aluno a", Aluno.class);
        java.util.List<Aluno> alunos = query.getResultList();

        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        manager.close();
        factory.close();
    }
}

