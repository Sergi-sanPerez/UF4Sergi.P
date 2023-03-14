package Reforç;

public class Client {
	
	private String nom;
	private Producte [] carret_de_compra;
	private int num=0;
	
	public Client(String nom) {
		this.nom=nom;
		carret_de_compra = new Producte[40];
	}
	
	public void afegirProducte(Producte producte) {
		this.carret_de_compra[num]=producte;
		num++;
	}
	public float calcularFactura() {
		float resultat=0;
		for(int i=0;i<num;i++) {
			resultat+=carret_de_compra[i].getPreu();
		}
		return resultat;
	}
	public String toString() {
		return this.nom;
	}


	
}
