package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderMethod1st 
{
	
	@DataProvider(name = "SearchDataSet")
	public Object[][]SearchData()
	{
		//index always start from 0 for row and column
		Object[][]searchKeyWord = new Object[3][2];
		
		searchKeyWord[0][0] =  "India"; 
		searchKeyWord[0][1]=  "Qutub minar"; 
		
		searchKeyWord[1][0] = "Agra";
		searchKeyWord[1][1]= "Tag mahal"; 
		
		searchKeyWord[2][0] = "Hyderabad";
		searchKeyWord[2][1]=  "charminar"; 
		
		return searchKeyWord; 
	}

}
