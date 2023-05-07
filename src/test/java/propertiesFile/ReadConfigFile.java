package propertiesFile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadConfigFile 
{   //property file ko read krne k liye java me ek class hai property nam ka to property class ka object create krenge
	//create object of properties Class to read the properties file
	Properties properties;
	
	//path of properties file
	String path ="F:\\ECLIPSE_PROJECTS\\PageObjectModelDemo\\src\\test\\java\\propertiesFile\\Config.properties";
	
	// create constructor  to load the configuration or(properties) file
	public ReadConfigFile()
	{   
		properties = new Properties();
	 
		//create file input steam object to load the(path) file/to read the property file
		try {                   
		FileInputStream fis= new FileInputStream(path);//take file input stream in try catch
		try {
			properties.load(fis);//take pro .in try catch
		} catch (IOException e) 
		{
			
		e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	
	}	
		
	//create method to read the properties/ create method to read the configuration file
		public String getURL()
		{
			String url= properties.getProperty("URL");
			if(url!=null)
				return url;
			else 
				throw new RuntimeException("URL not specified in config file");
				
		}
		
		public String getUsername()
		{
			String username= properties.getProperty("username");
			if(username!=null) 
				return username;
			else 
				throw new RuntimeException("username not specified in config file");
				
		}
		public String getPassword()
		{
			String password= properties.getProperty("password");
			if(password!=null) 
				return password;
			else 
				throw new RuntimeException("password not specified in config file");
				
		}
		
		
		
			
		}
	


