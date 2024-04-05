package controller;

import javax.swing.JOptionPane;

import model.ICalculoImpostosUrbanos;

public class TaxaImpostoSaoPaulo implements ICalculoImpostosUrbanos {

	@Override
	public double aplicarImposto() {

		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("insira a área total"));
		int numeroDeComodos = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de cômodos"));

		double imposto = (areaTotal * 10) + (numeroDeComodos * 2);

		return imposto;
	}

}
