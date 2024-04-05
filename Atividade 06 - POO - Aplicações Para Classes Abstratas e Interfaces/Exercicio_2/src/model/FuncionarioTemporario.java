package model;

public class FuncionarioTemporario extends Funcionario {

	private int diaParaFimDoContrato;
	private int mesParaFimDoContrato;
	private int anoParaFimDoContrato;

	// Construtores
	public FuncionarioTemporario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FuncionarioTemporario(int id, String nome, double salario, int diaParaFimDoContrato,
			int mesParaFimDoContrato, int anoParaFimDoContrato) {
		super(id, nome, salario);

		this.diaParaFimDoContrato = diaParaFimDoContrato;
		this.mesParaFimDoContrato = mesParaFimDoContrato;
		this.anoParaFimDoContrato = anoParaFimDoContrato;
	}

	// Getters e Setters
	public int getDiaParaFimDoContrato() {
		return diaParaFimDoContrato;
	}

	public void setDiaParaFimDoContrato(int diaParaFimDoContrato) {
		this.diaParaFimDoContrato = diaParaFimDoContrato;
	}

	public int getMesParaFimDoContrato() {
		return mesParaFimDoContrato;
	}

	public void setMesParaFimDoContrato(int mesParaFimDoContrato) {
		this.mesParaFimDoContrato = mesParaFimDoContrato;
	}

	public int getAnoParaFimDoContrato() {
		return anoParaFimDoContrato;
	}

	@Override
	public String toString() {
		return "FuncionarioTemporario [diaParaFimDoContrato=" + diaParaFimDoContrato + ", mesParaFimDoContrato="
				+ mesParaFimDoContrato + ", anoParaFimDoContrato=" + anoParaFimDoContrato + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + ", getSalario()=" + getSalario() + "]";
	}

	public void setAnoParaFimDoContrato(int anoParaFimDoContrato) {
		this.anoParaFimDoContrato = anoParaFimDoContrato;
	}

}