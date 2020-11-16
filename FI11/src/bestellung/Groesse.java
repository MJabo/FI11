package bestellung;

public class Groesse {
	
	private String groesse;
	private double preiszusatz;
	
	
	public String getGroesse() {
		return groesse;
	}


	public void setGroesse(String groesse) {
		this.groesse = groesse;
	}


	public double getPreiszusatz() {
		return preiszusatz;
	}


	public void setPreiszusatz(double preiszusatz) {
		this.preiszusatz = preiszusatz;
	}


	public Groesse(String groesse, double preiszusatz)
	{
		this.groesse = groesse;
		this.preiszusatz = preiszusatz;
	}
	
	
	@Override
	public String toString() {
		return this.groesse;
	}
	
	
	
}
