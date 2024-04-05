package model;

public class FuncionariosDeTempoIntegral extends Funcionario {

	private int bancoDeHoras;

	// Construtores
	public FuncionariosDeTempoIntegral() {
		super();
	}

	public FuncionariosDeTempoIntegral(int id, String nome, double salario, int bancoDeHoras) {
		super(id, nome, salario);
		this.bancoDeHoras = bancoDeHoras;
	}

	// Getters e Setters
	public int getBancoDeHoras() {
		return bancoDeHoras;
	}

	public void setBancoDeHoras(int bancoDeHoras) {
		this.bancoDeHoras = bancoDeHoras;
	}

	@Override
	public String toString() {
		return "FuncionariosDeTempoIntegral [bancoDeHoras=" + bancoDeHoras + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getSalario()=" + getSalario() + "]";
	}

}
