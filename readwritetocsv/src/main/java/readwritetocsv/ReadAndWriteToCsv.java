package readwritetocsv;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class ReadAndWriteToCsv {
	
	public static void main(String args[])
	{
		try
		{
		File csvFile2 = new File("C:\\Users\\siddhi.saxena\\Desktop\\ReadFrom.csv");
		if(csvFile2.isFile())
		{
			System.out.println("present");
		}
		else
			System.out.println("Not Present");
		String [] str= {"3", "Messi", "Barcelona"};
		String [] str2 = {"2", "Neymar", "PSG"};
		String [] str3 = {"1", "Ronaldo", "RealMadrid"};
	
			FileWriter writeon = new FileWriter(csvFile2);
			CSVWriter writeOnFile = new CSVWriter(writeon);
			writeOnFile.writeNext(str);
			writeOnFile.writeNext(str2);
			writeOnFile.writeNext(str3);
			writeon.close();
			writeOnFile.close();
			
			FileReader readFromFile = new FileReader(csvFile2);
			CSVReader readFromCSVFile = new CSVReader(readFromFile);
			List<String[]> listOfData = readFromCSVFile.readAll();
			Collections.sort(listOfData, (o1,o2) ->
			o1[0].compareTo(o2[0]));
		}
		
		catch(IOException ex)
		{
			System.out.println();
		}
	}

}
