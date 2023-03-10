package Ac1;

public class UsaInstitut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institut sm = new Institut("Serra de Miramar");
		Institut jh = new Institut("Jamue huguet",300);
		Alumne s = new Alumne("Sergi", 18, "23658492X", "sps@gmail.com");
		Alumne d = new Alumne("David", 18, "12549637X", "drs@gmail.com");
		Alumne l = new Alumne("Luis", 18, "12396587X", "lmy@gmail.com");
		Alumne g = new Alumne("Gerard", 18, "36549325X", "gam@gmail.com");
		Alumne e = new Alumne("Edu", 18, "23654798X", "ebm@gmail.com");
		Alumne a = new Alumne("Anna", 20, "1265489X", "sps@gmail.com");
		
		sm.afegirAlumne(s);
		sm.afegirAlumne(d);
		sm.afegirAlumne(l);
		jh.afegirAlumne(g);
		jh.afegirAlumne(e);
		jh.afegirAlumne(a);
		
		
		for(int i=0;i<sm.getNum();i++) {
			System.out.println(sm.getLlistaAlumnes()[i].getNom());
		}
		for(int i=0;i<jh.getNum();i++) {
			System.out.println(jh.getLlistaAlumnes()[i].getNom());
		}
	}

}
