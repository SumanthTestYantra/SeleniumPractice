package dataDriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingDataFromJSONFile {
	public static void main(String[] args) throws IOException, ParseException {
		File file=new File("./testData/testData.json");
		FileReader fr=new FileReader(file);
		JSONParser parser=new JSONParser();
		JSONObject json=(JSONObject) parser.parse(fr);
		System.out.println(json.get("name"));
		System.out.println(json.get("place"));
	}
}
