
public class Libro {
	private String titolo;
	private String autore;
	private String codice;
	private int pagine;
	
	
	
	public Libro(String titolo, String autore) {

		this.titolo = titolo;
		this.autore = autore;
	}

	
	public String getCodice() {
		return codice;
	}

	


	public void setCodice(String codice) {
		this.codice = codice;
	}

	public int getPagine() {
		return pagine;
	}


	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public String getTitolo() {
		return titolo;
	}


	public String getAutore() {
		return autore;
	}
	
	@Override
		public String toString() {
			return "titolo=" + titolo + ", autore=" + autore + ", codice=" + codice + ", pagine=" + pagine ;
		}


	public static void main(String[] args) {
		Libro l1 = new Libro("pomessi sposi", "stanca");
		System.out.println(l1);
		l1.setPagine(100);
		System.out.println(l1);
		l1.setCodice("asd");
		System.out.println(l1);
		
		System.out.println(l1.getTitolo());
		
	}
}
