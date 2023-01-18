import java.util.*;

public class Departamento {
	private String nome;
	private List <Funcionario> funcionarios;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		this.getFuncionarios().add(funcionario);
		
		System.out.println("Funcionario adicionado com sucesso!");
	}

	public void removerFuncionario(Funcionario funcionario){
		if (this.getFuncionarios().contains(funcionario)) {
			
			this.getFuncionarios().remove(funcionario);

			System.out.println("Funcionário removido com sucesso!");
		}

		else {
			System.out.println("O funcionário não está cadastrado no sistema!");
		}
	}
}
