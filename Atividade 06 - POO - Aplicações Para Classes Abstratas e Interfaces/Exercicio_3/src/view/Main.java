package view;

import controller.TaxaImpostoBeloHorizonte;
import controller.TaxaImpostoCuritiba;
import controller.TaxaImpostoPortoAlegre;
import controller.TaxaImpostoSaoPaulo;

public class Main {

	public static void main(String[] args) {
		TaxaImpostoSaoPaulo taxaSaoPaulo = new TaxaImpostoSaoPaulo();
		TaxaImpostoBeloHorizonte taxaBelohorizonte = new TaxaImpostoBeloHorizonte();
		TaxaImpostoPortoAlegre taxaPortoAlegre = new TaxaImpostoPortoAlegre();
		TaxaImpostoCuritiba taxaCuritiba = new TaxaImpostoCuritiba();

		System.out.println(taxaSaoPaulo.aplicarImposto());
		System.out.println(taxaBelohorizonte.aplicarImposto());
		System.out.println(taxaPortoAlegre.aplicarImposto());
		System.out.println(taxaCuritiba.aplicarImposto());

	}

}
