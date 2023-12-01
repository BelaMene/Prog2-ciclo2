package orm.actions;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import orm.modelo.Aluno;

public class ListarAlunosPorInicial {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a inicial para pesquisa: ");
        String inicial = scanner.nextLine();


        TypedQuery<Aluno> query = manager.createQuery("SELECT a FROM Aluno a WHERE SUBSTRING(a.nome, 1, 1) = :inicial", Aluno.class);
        query.setParameter("inicial", inicial);
        List<Aluno> alunos = query.getResultList();


        System.out.println("Lista de Alunos com a letra '" + inicial + "':");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        
        scanner.close();
        manager.close();
        factory.close();
    }
}