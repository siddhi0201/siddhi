package readwritetocsv;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class ReadWriteToCsvFile {
	
	public static void main(String args[])
	{
	
	
		try
		{
			File csvFile = new File("C:\\Users\\siddhi.saxena\\Desktop\\ReadFrom.csv");
			if(csvFile.isFile())
			{
				System.out.println("isPresent");
			}
			else
				System.out.println("File Not Present");
			
			String [] str= {"3", "Messi", "Barcelona"};
			String [] str2 = {"2", "Neymar", "PSG"};
			String [] str3 = {"1", "Ronaldo", "RealMadrid"};
			
			FileWriter writer = new FileWriter(csvFile);
			CSVWriter csvWrite = new CSVWriter(writer);
			csvWrite.writeNext(str);
			csvWrite.writeNext(str2);
			csvWrite.writeNext(str3);
			csvWrite.close();
			writer.close();
			
			FileReader readFromFile = new FileReader(csvFile);
			CSVReader csvReader = new CSVReader(readFromFile);
			List<String []> list = csvReader.readAll();
			
			for(String[] row : list) {
				Arrays.sort(row);
			}
			
			
			
			Collections.sort(list, (o1,o2) -> o1[0].compareTo(o2[0]));
			csvReader.close();
			readFromFile.close();
			
			File csvFile2 = new File("C:\\Users\\siddhi.saxena\\Desktop\\WriteTo.csv");
			FileWriter writer2 = new FileWriter(csvFile2);
			CSVWriter csvFilewriter = new CSVWriter(writer2);
			csvFilewriter.writeAll(list);
			
			writer2.close();
			csvFilewriter.close();
			
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
