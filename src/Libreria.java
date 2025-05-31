//versione 0
//

import java.util.Arrays;

public class Libreria {
	private String nome;
	private int maxLibri;
	private int pos;
	
	//array oggetti
	private Libro[] libri;
	
	//private Libro libri[];
	
	public Libreria(String nome, int maxLibri) {
		this.nome = nome;
		this.maxLibri = maxLibri;
		libri= new Libro [maxLibri];
		pos=0;
		
	}
	
	//aggiungi libri per posizione
	/*public void addLibro (Libro l, int pos) {
		libri[pos] = l;
	}*/
	
	/*public boolean addLibro (Libro l, int pos) {
		
		if (pos >= libri.length)
			return false;
		libri[pos] = l;
		return true;
		
	}*/
	
	public boolean addLibro (Libro l) {
		
		if (pos >= libri.length)
			return false;
		libri[pos] = l;
		pos++;
		return true;	
	}
	/*
	public boolean addLibro (String titolo, String autore) {
		
		if (pos >= libri.length)
			return false;
		libri[pos] = new Libro(titolo, autore);
		pos++;
		return true;	
	}*/
	
	//cancellazione
	
	public void delLibro (int pos) {
		libri[pos] = null;
	}
	
	//cancella per codice
	public boolean delLibroCodice(String codice)
	{
		for (int i=0; i<libri.length;i++) {
			if (libri[i]!=null && libri[i].getCodice().equalsIgnoreCase(codice)) {
				libri[i] = null;
				return true;
			}
		}
		return false;
	}
	@Override
	//public String toString() {
	//	return "Libreria [nome=" + nome + ", maxLibri=" + maxLibri + ", libri=" + Arrays.toString(libri) + "]";
	//}

	public String toString() {
		String s= nome + "\n";
		for (int i=0; i<libri.length;i++) {
			if (libri[i] != null)
					s+=libri[i]+"\n";
		}
		return s;
	}
	public static void main(String[] args) {
		Libreria libMeucci = new Libreria("meucci via pendino", 3);
		
		Libro l1 = new Libro("t1", "a1");
		Libro l2 = new Libro("t2", "a2");
		Libro l3 = new Libro("t3", "a3");
		l1.setCodice("c1");
		l2.setCodice("c2");
		l3.setCodice("c3");
		/*
		libMeucci.addLibro(l1, 0);
		libMeucci.addLibro(l2, 1);
		libMeucci.addLibro(l3, 2);*/
		
		System.out.println(libMeucci.addLibro(l1));
		System.out.println(libMeucci.addLibro(l2));
		System.out.println(libMeucci.addLibro(l3));
		//libMeucci.addLibro("libro2", "pippo");
		System.out.println(libMeucci);
		//libMeucci.delLibro(2);
		System.out.println(libMeucci.delLibroCodice("cc2"));
		System.out.println(libMeucci);
	}

	

}
