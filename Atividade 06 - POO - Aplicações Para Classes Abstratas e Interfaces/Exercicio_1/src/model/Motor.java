package model;

public class Motor {

	private int qtdPist;
	private int potencia;
	
	//construtores
	public Motor() {
		super();
		qtdPist = 0;
		potencia = 0;
	}
	
	//Métodos
	public int getQtdPist() {
		return qtdPist;
	}
	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
}
