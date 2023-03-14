package Concessionari;

import Ac1.Alumne;

public class Concesionario {
	
	private String Bestidor;
	private String nom;
	private Coche [] llista_coche;
	private int num=0;
	
	public Concesionario() {
		llista_coche = new Coche [40];
	}
	
	public void nuevoCoche(Coche coche) {
		this.llista_coche[num]=coche;
		num++;
	}
	public String toString() {
		System.out.println("Coches en concesionario:");
		for(int i=0;i<num;i++) {
			 System.out.println("Coche: "+llista_coche[i].getMarca()+" Modelo: "+llista_coche[i].getModel()+" Bastidor: "+llista_coche[i].getBestidor());
		}
		System.out.println();
		return "";
	}
	public Coche buscaCoche(String Bestidor) {
		for(int i=0;i<num;i++) {
			 if (llista_coche[i].getBestidor().equals(Bestidor)) {
				 return llista_coche[i];
			 }
		}
		return null;
		
	}
	
}
