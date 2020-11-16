package bestellung;

public class Extras {
	
	private String extraZutat;
	private double zusatzPreis;
	
	
	public Extras(String extraZutat, double zusatzPreis)
	{
		this.extraZutat = extraZutat;
		this.zusatzPreis = zusatzPreis;
	}


	public double getZusatzPreis() {
		return zusatzPreis;
	}


	public void setZusatzPreis(double zusatzPreis) {
		this.zusatzPreis = zusatzPreis;
	}


	public String getExtraZutat() {
		return extraZutat;
	}
	public void setExtraZutat(String extraZutat) {
		this.extraZutat = extraZutat;
	}

	@Override
	public String toString() {
		return this.extraZutat;
	}
	
	
	
}
