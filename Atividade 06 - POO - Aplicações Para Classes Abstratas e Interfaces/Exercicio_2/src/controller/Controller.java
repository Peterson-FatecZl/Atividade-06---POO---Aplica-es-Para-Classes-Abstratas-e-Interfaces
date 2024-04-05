package controller;

import model.Funcionario;
import model.FuncionarioDeTempoParcial;
import model.FuncionarioTemporario;
import model.FuncionariosDeTempoIntegral;

public class Controller {

	public Funcionario contratacao(int id, String nome, double salario, int bancoDeHoras) {

		return new FuncionariosDeTempoIntegral(id, nome, salario, bancoDeHoras);
	}

	public Funcionario contratacao(int id, String nome, double salario, double d,
			double e) {

		return new FuncionarioDeTempoParcial(id, nome, salario, d, e);
	}

	public Funcionario contratacao(int id, String nome, double salario, int diaParaFimDoContrato,
			int mesParaFimDoContrato, int anoParaFimDoContrato) {
		return new FuncionarioTemporario(id, nome, salario, diaParaFimDoContrato, mesParaFimDoContrato,
				anoParaFimDoContrato);
	}
}
