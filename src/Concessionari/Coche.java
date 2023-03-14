package Concessionari;

public class Coche {
	
	private String Marca;
	private String Model;
	private String Bestidor;
	
	public Coche(String Bestidor) {
		this.Bestidor=Bestidor;
	}
	public void setMarca(String marca) {
		this.Marca=marca;
	}
	public void setModelo(String model) {
		this.Model=model;
	}
	public String getMarca() {
		return Marca;
	}
	public String getModel() {
		return Model;
	}
	public void setBestidor(String bestidor) {
		this.Bestidor = bestidor;
	}
	public String getBestidor() {
		return Bestidor;
	}
	public String toString() {
		return "Coche: "+this.Marca+" Modelo: "+this.Model+" Matricula: "+this.Bestidor;
	}
	
}
