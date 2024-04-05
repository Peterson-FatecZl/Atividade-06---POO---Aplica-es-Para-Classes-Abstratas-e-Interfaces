package view;

import model.*;

public class Main {

	public static void main(String[] args) {

		Veiculo passeio = new Passeio();
		Veiculo carga = new Carga();
		
		System.out.println("O veiculo de Carga fez o percurso de 10km em: "+carga.calcVel(80)+"h");
		System.out.println("O veiculo de Passeio fez o percurso de 10km em: "+passeio.calcVel(120)+"h");
		
	}

}
