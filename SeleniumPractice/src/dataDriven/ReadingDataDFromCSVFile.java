package dataDriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadingDataDFromCSVFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./testData/testData.csv");
		FileReader fr=new FileReader(file);
		CSVReader csv=new CSVReader(fr);
		String[] data=csv.readNext();
		for(String s:data)
		{
			System.out.println(s);
		}
	}
}
