package controller;

import javax.swing.JOptionPane;

import model.ICalculoImpostosUrbanos;

public class TaxaImpostoBeloHorizonte implements ICalculoImpostosUrbanos {
	@Override
	public double aplicarImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "insira a área total"));
		int numeroDeQuartos = Integer.parseInt(JOptionPane.showInputDialog("Insira a Quantidade de quartos"));

		double imposto = (areaTotal * 7) + (numeroDeQuartos * 4);

		return imposto;
	}
}
