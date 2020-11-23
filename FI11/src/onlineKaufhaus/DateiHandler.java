package onlineKaufhaus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class DateiHandler {
	
	public DateiHandler()
	{
		
	}
	
	public abstract ArrayList<Artikel> dateilesen(ArrayList arraylist, String filname);
	
	public abstract void dateiSchreiben(ArrayList arraylist, String filename);
	
	
	public ArrayList<Artikel> dateiReader(ArrayList<Artikel> arraylist,String filename)
	{
		ArrayList<Artikel> liste = new ArrayList<>();
		try
		{
			String zeile = null;
			BufferedReader in = new BufferedReader(new FileReader(filename));
			try {
				while((zeile = in.readLine()) != null)
				{
					zeile.replace(',', '.');
					zeile.replace('€', ' ');
					String[] splited = zeile.split(";");
					liste.add(new Artikel(splited[0],splited[1],splited[2]));	
				}	
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			finally
			{
				in.close();
			}			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return liste;
	}
	
	
}
