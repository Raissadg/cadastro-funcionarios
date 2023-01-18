public class Estagiario extends Funcionario {
	private Instituicao curso;

	public Instituicao getCurso() {
		return curso;
	}

	public void setCurso(final Instituicao curso) {
		this.curso = curso;
	}

	public void adicionalSalario() {
		if (this.getCursosAdicionais().size() > 4) {
			double adicional = this.getSalario() * 0.1;
			this.setSalario(this.getSalario() + adicional);
		}
	}
}