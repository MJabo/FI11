package onlineKaufhaus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

public abstract class DateiHandler {
	
	protected BufferedReader in;
	protected BufferedWriter out;
	
	public DateiHandler()
	{
		
	}
	
	
	public abstract ArrayList<Artikel> dateilesen(String filname);
	
	public abstract void dateiSchreiben(String benutzername, DefaultListModel<Artikel> auswahl, String kunde);
	
	
	protected void dateiSchreiben(DefaultListModel<Artikel> auswahl)
	{
		
			try
			{	
				for(int i= 0; i < auswahl.getSize(); i++)
				{
					out.write(auswahl.get(i).toString());
					out.newLine();
					
					System.out.println(auswahl.get(i).toString()); // überprüfen was in der Datei steht
				}
				
			} catch (IOException e) 
			{
				System.out.println("Input Output Fehler");
			} 
			catch(Exception e)
			{
				System.out.println("Fehler");
			}
			finally
			{
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
		
	
	
	
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
