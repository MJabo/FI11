package onlineKaufhaus;

import java.io.BufferedReader;
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
		
		ArrayList<Artikel> liste = new ArrayList<>();
		liste = dateiReader(arraylist,filename);
		return liste;
	}
	
	
	
	

	@Override
	public void dateiSchreiben(ArrayList arraylist, String filename) {
		// TODO Auto-generated method stub
		
	}

}
