package onlineKaufhaus;

public class Artikel {

	private static String[] artikelDaten= new String[3];
	
	private String artikelnummer;
	private String artikel;
	private String preis;
	
	
	
	public Artikel()
	{
		
	}
	
	
	public Artikel(String artikelnummer, String artikel, String preis) {
		super();
		this.artikelnummer = artikelnummer;
		this.artikel = artikel;
		this.preis = preis;
	}
	
	public String getArtikelnummer() {
		return artikelnummer;
	}
	public void setArtikelnummer(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	public String getArtikel() {
		return artikel;
	}
	public void setArtikel(String artikel) {
		this.artikel = artikel;
	}
	public String getPreis() {
		return preis;
	}
	public void setPreis(String preis) {
		this.preis = preis;
	}
	
	public String toString(){
		return this.artikelnummer + " " + this.artikel +" " + this.preis;
		
	}
}
