package onlineKaufhaus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DHIO extends DateiHandler {

	public DHIO()
	{
		
		
	}
	
	@Override
	public ArrayList<Artikel> dateilesen(ArrayList arraylist, String filename) {
		
		/*
		ArrayList<Artikel> liste = new ArrayList<>();
		liste = dateiReader(arraylist,filename);
		return liste;
		*/
		
		
		
		try {
			String zeile = null;
			BufferedReader in = new BufferedReader(new FileReader(filename));
			zeile = in.readLine();
			ArrayList<Artikel> arrayliste = dateiReader(in,zeile);
			in.close();
			return arrayliste;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	

	@Override
	public void dateiSchreiben(ArrayList arraylist, String filename) {
		
		
		
	}

}
