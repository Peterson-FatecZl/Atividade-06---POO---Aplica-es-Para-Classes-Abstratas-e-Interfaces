package model;

public class Carga extends Veiculo {

	private int cargaMax;
	private int tara;
	
	//Contrutores
	public Carga() {
		super();
		this.cargaMax = 0;
		this.tara = 0;
	}

	//Getters e Setters
	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}
	
	//Métodos
	@Override
	public float calcVel(float velocMax) {

		int centimetros = 1000000;
		float quilometros = centimetros / 100000;
		float tempo = velocMax / quilometros;
		
		return tempo;
	}

	
	
	
	
	
}
