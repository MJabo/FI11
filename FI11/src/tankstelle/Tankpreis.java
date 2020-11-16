package tankstelle;

public class Tankpreis {
	private String sprit;
	private double preis;
	
	public Tankpreis()
	{}
	
	
	
	public Tankpreis(String sprit, double preis)
	{
		this.sprit = sprit;
		this.preis = preis;
	}

	public String getSprit() {
		return sprit;
	}

	public void setSprit(String sprit) {
		this.sprit = sprit;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		return this.sprit;
	}
	
}
