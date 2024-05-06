package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testData/testData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("driverKey"));
		System.out.println(prop.get("driverPath"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
	}
}
