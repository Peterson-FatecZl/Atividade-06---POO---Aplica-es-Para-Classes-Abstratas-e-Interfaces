package view;

import javax.swing.JOptionPane;

import controller.Controller;
import model.Funcionario;

public class Main {
	public static void main(String[] Args) {

		Controller ce = new Controller();

		Funcionario funcionarioIntegral = ce.contratacao(1, "Funcionario Tempo integral", 3500.50, 200);
		Funcionario funcionarioParcial = ce.contratacao(10, "Funcionario Tempo Parcial", 2500.00, 09.00, 19.00);
		Funcionario funcionarioTemporario = ce.contratacao(100, "funcionario Temporario", 4000.00, 15, 04, 2024);

		System.out.println(funcionarioIntegral.toString());
		System.out.println(funcionarioParcial.toString());
		System.out.println(funcionarioTemporario.toString());

	}
}
