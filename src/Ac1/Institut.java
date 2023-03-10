package Ac1;

public class Institut {
	
	private String nom;
	private Alumne [] llistaAlumnes;
	private int num=0;

	
	public Alumne[] getLlistaAlumnes() {
		return llistaAlumnes;
	}
	public void setLlistaAlumnes(Alumne[] llistaAlumnes) {
		this.llistaAlumnes = llistaAlumnes;
	}
	public Institut(String nom) {
		this.nom = nom;
		llistaAlumnes=new Alumne [100];
	}
	public Institut(String nom, int max) {
		this.nom = nom;
		this.llistaAlumnes = new Alumne[max];
	}
	
	public void  afegirAlumne(Alumne alumne) {
		this.llistaAlumnes[num]=alumne;
		num++;
		
	}
	public int getNum() {
		return num;
	}

	
	
	
	
}
