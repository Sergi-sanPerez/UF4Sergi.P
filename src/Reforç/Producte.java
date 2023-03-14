package Reforç;

public class Producte {
	
	private float preu;
	private String nom;
	
	public float getPreu() {
		return preu;
	}

	public String getNom() {
		return nom;
	}
	
	public Producte(String nom, float preu) {
		this.nom=nom;
		this.preu=preu;
	}
	public String toString() {
		return this.nom+": "+this.preu;
	}
}
