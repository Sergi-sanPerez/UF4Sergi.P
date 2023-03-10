package Ac1;

public class Alumne {
	
	private String nom;
	private int edat;
	private String dni;
	private String email;
	
	public String getNom() {
		return nom;
	}

	public Alumne(String nom, int edat, String dni, String email) {
		this.nom = nom;
		this.edat = edat;
		this.dni = dni;
		this.email = email;
	}
}
