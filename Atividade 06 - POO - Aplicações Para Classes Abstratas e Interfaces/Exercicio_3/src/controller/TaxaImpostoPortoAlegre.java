package controller;

import javax.swing.JOptionPane;

import model.ICalculoImpostosUrbanos;

public class TaxaImpostoPortoAlegre implements ICalculoImpostosUrbanos {
	@Override
	public double aplicarImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "insira a área total"));
		double areaDaGaragem = Double.parseDouble(
				JOptionPane.showInputDialog(null, "insira a área da garagem (Se não houver garagem insira 0)"));

		if (areaDaGaragem == 0) {
			double imposto = (areaTotal * 8);
			return imposto;
		} else {
			double imposto = (areaTotal * 7.5) + (areaDaGaragem * 2.5);
			return imposto;
		}
	}
}
