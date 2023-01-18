import java.util.*;

public class Funcionario implements Empresa {
	
	private String nome;
	private String sexo;
	private String cpf;
	private String celular;
	private double salario;
	private Departamento departamento;
	private ArrayList cursosAdicionais;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList getCursosAdicionais() {
		return cursosAdicionais;
	}

	public void setCursosAdicionais(ArrayList cursosAdicionais) {
		this.cursosAdicionais = cursosAdicionais;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void adicionarCurso(String curso) {
		this.getCursosAdicionais().add(curso);
	}
		
	public void adicionalSalario() {
		if (this.getCursosAdicionais().size() > 4) {

			double adicional = this.getSalario() * 0.25;
			
			this.setSalario(this.getSalario() + adicional);
		}
	}
}
