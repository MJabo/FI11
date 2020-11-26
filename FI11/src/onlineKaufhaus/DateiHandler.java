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
	
	public abstract ArrayList<Artikel> dateilesen(ArrayList arraylist, String filname);
	
	public abstract void dateiSchreiben(ArrayList arraylist, String filename);
	
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
	
	
	//-------------------------------------------------------------------------------------
		/*
		public ArrayList<Artikel> dateiReader(ArrayList<Artikel> arraylist,String filename)
		{
			ArrayList<Artikel> liste = new ArrayList<>();
			try
			{
				String zeile = null;
				BufferedReader in = new BufferedReader(new FileReader(filename));
				try {
					zeile = in.readLine();
					while((zeile = in.readLine()) != null)
					{
							
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
		//----------------------------------------------------------------------- 
		
		public ArrayList<Artikel> dateiReader(BufferedReader in, String zeile)
		{
			ArrayList<Artikel> liste = new ArrayList<>();
			try
			{
				int i = 0;
				
				try {
					while((zeile = in.readLine()) != null) //Inhalt datei pro Zeile lesen bis nicht mehr dabei ist;
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
				finally  // final wird auf jedenfall ausgeführt !!
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
		*/
	
	
	
	
}
