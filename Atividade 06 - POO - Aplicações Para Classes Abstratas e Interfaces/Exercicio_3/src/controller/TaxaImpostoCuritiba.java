package controller;

import javax.swing.JOptionPane;

import model.ICalculoImpostosUrbanos;

public class TaxaImpostoCuritiba implements ICalculoImpostosUrbanos{

	@Override
	public double aplicarImposto() {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "insira a área total"));
		double idadeImovel = Integer.parseInt(JOptionPane.showInputDialog(null, "insira a idade do imóvel em anos"));

		double imposto = areaTotal * 5;
		if(idadeImovel > 50) {
			imposto += (idadeImovel * 3);
		}else if(idadeImovel < 20) {
			imposto += (idadeImovel * 2);
		}else {
			imposto += (idadeImovel * 2.5);
		}
		return imposto;
		
	}

}
