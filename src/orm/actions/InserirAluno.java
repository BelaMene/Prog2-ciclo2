package orm.actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;


public class InserirAluno {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do aluno:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Data de nascimento: ");
        String datanascimento = scanner.nextLine();
        
        System.out.print("Naturalidade: ");
        String naturalidade = scanner.nextLine();
        
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setEmail(email);
        aluno.setCpf(cpf);
        aluno.setDataNascimento(datanascimento);
        aluno.setNaturalidade(naturalidade);
        aluno.setEndereco(endereco);
        
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit(); 
		
		scanner.close();
		manager.close();
		factory.close();


}
}
