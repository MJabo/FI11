package onlineKaufhaus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class DateiHandler {
	
	protected BufferedReader in;
	
	
	
	
	
	
	public DateiHandler()
	{
		
	}
	
	
	public abstract ArrayList<Artikel> dateilesen(String filname);
	
	
	protected ArrayList<Artikel> dateilesen() throws IOException
	{
		ArrayList<Artikel> liste = new ArrayList<>();
		String zeile = null;			
		
		try 
		{
			zeile = in.readLine();
			while((zeile = in.readLine()) != null)
			{
				zeile.replace(',', '.');
				zeile.replace('€', ' ');
				String[] splited = zeile.split(";");
				liste.add(new Artikel(splited[0],splited[1],splited[2]));
			}			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			in.close();
		}
		return liste;
	}
	
	
	
	
	public void dateiWriter(ArrayList arrayList)
	{
		
	}	
	
}
