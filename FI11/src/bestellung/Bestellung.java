package bestellung;

public class Bestellung { //Für das spätere speichern der Bestellungen

	static double gesamtpreis = 0;
	
	private PizzaSorte pizza;
	private Groesse groesse;
	private Extras extras;
	
	public Bestellung(PizzaSorte pizza, Groesse groesse, Extras extras)
	{
		this.pizza = new PizzaSorte(pizza.getSorte(),pizza.getPreis());
		this.groesse = new Groesse(groesse.getGroesse(),groesse.getPreiszusatz());
		this.extras = new Extras(extras.getExtraZutat(), extras.getZusatzPreis());
		gesamtpreis = gesamtpreis + berechenePreis();
	}
	
	public double getGesamtPreis()
	{
		return gesamtpreis;
	}
	
	public double berechenePreis()
	{
		return pizza.getPreis() + groesse.getPreiszusatz() + extras.getZusatzPreis() ;
	}
	
	public double stonieren(Bestellung bestellung)
	{
		gesamtpreis = gesamtpreis - bestellung.berechenePreis();
		return gesamtpreis;
	}
	
	
	public String toString()
	{
		return pizza + " " + groesse + " " + extras;
	}
}
