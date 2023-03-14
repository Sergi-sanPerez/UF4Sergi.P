package Reforç;

public class Supermercat {
	
	private String nom;
	private Client [] llista_clients;
	private int num=0;
	
	public Supermercat(String nom) {
		this.nom=nom;
		
	}
	public void afegirClient(Client client) {
		this.llista_clients[num]=client;
		num++;
	}
	public float calcularTotesLesFactures(Client client) {
		float resultat=0;
		for(int i=0; i<num;i++) {
			resultat+=llista_clients[i].calcularFactura();
		}
		return resultat;
	}
	
}
