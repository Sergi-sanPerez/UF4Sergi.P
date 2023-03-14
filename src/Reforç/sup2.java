package Reforç;

public class sup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producte llaunaC= new Producte("Cocacola", (float)1.5);
		Producte llaunaP= new Producte("Pepsis", (float)1.45);
		Producte llaunaA= new Producte("Acuarius", (float)1.35);
		Producte llaunaS= new Producte("Sprite", (float)1.10);
		
		Client D=new Client("David");
		
		D.afegirProducte(llaunaP);
		D.afegirProducte(llaunaC);
		
		System.out.println(D.calcularFactura());
		
		System.out.println(llaunaA);
		System.out.println(D);
		System.out.println(llaunaS);
	}

}
