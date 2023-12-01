package orm.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alunos")
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	@Column
    private String nome;
    @Column
    private String email;
    @Column
    private String cpf;
    @Column
    private String datanascimento;
    @Column
    private String naturalidade;
    @Column
    private String endereco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return datanascimento;
	}
	public void setDataNascimento(String data) {
		this.datanascimento = data;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", naturalidade='" + naturalidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
	
	

}