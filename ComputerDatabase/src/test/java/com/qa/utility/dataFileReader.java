/**
 * 
 */
package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Shamsur.Masum
 *
 */
public class dataFileReader {
	
	
	
	Properties dataReader;
	
	public dataFileReader()
	{
		try {
			File src= new File("./src/test/java/com/qa/utility/dataFile.properties");
			FileInputStream data= new FileInputStream(src);
			dataReader= new Properties();
			dataReader.load(data);
		} 
		catch (IOException e) {
			System.out.println("Exception for Property file configaratonis =="+e.getMessage());
		}
	}
	
	public String getBrowserSelected(){
		String browser=dataReader.getProperty("browser");
		return browser;
	}
	

	public String getAppUrl(){
		String url= dataReader.getProperty("url");
		return url;
	}
	
	
	//----------------------------
	
	
	public String getComputerName(){
		String url= dataReader.getProperty("computerName");
		return url;
	}
	
	public String getIntroducedDate(){
		String url= dataReader.getProperty("introducedDate");
		return url;
	}
	
	public String getDiscontinuedDate(){
		String url= dataReader.getProperty("discontinuedDate");
		return url;
	}
	public String getCompany(){
		String url= dataReader.getProperty("company");
		return url;
	}

	
	
	public String getModifiedDiscontinuedDate(){
		String url= dataReader.getProperty("modifiedDiscontinuedDate");
		return url;
	}
	public String getModifiedCompany(){
		String url= dataReader.getProperty("modifiedCompany");
		return url;
	}
}
