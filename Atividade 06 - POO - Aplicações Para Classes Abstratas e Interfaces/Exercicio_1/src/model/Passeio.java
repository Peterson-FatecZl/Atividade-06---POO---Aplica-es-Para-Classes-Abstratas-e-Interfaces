package model;

public class Passeio extends Veiculo{
	
	private int qtdPassageiros;
	
	//Construtores
	public Passeio() {
		super();
		qtdPassageiros = 0;
	}
	
	
	//Getters e Setters
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	//Métodos
	@Override
	public float calcVel(float velocMax) {
		int metros = 10000;
		float quilometros = metros / 1000;
		float tempo = velocMax / quilometros; 
		
		return tempo;
	}

}
