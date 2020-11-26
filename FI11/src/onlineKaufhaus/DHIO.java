package onlineKaufhaus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class DHIO extends DateiHandler {

	public DHIO()
	{
		
		
	}
	
	@Override
	public ArrayList<Artikel> dateilesen(String filename) {
		/*
		ArrayList<Artikel> liste = new ArrayList<>();
		liste = dateiReader(arraylist,filename);
		return liste;
		*/
		try {
			super.in = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // für filename nachio
		
		try {
			return super.dateilesen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
		
	}
	
	
	
	

	@Override
	public void dateiSchreiben(ArrayList arraylist, String filename) {
		
		
		
	}

	@Override
	public ArrayList<Artikel> dateilesen(ArrayList arraylist, String filname) {
		// TODO Auto-generated method stub
		return null;
	}

}
