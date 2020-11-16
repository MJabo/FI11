package bestellung;

public class PizzaSorte {
	
	private String sorte;
	private double preis;
	
	public PizzaSorte(String sorte, double preis)
	{
		this.sorte = sorte;
		this.preis = preis;
	}
	
	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}



	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	/*
	public PizzaSorte(String sorte)
	{
		this.sorte = sorte;
	}
	*/

	@Override
	public String toString() {
		return this.sorte;
	}
	
	
}
