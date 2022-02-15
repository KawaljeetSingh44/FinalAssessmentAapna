package stringAndArrayColection;

import org.junit.Test;

public class FantasticFind 

 {
	@Test
	public void Fantastic() 
	
	{
	String[] value = new String[5]; //allocating memory dynamically
	value[0] = "NotFantastic";
	value[1] = "Fantastic";
	value[2] = "Bad";
	value[3] ="good";
	value[4] = "pretty";
	String find = "Fantastic";  //String to be compared
	int len = find.length();
	for(int i = 0;i<5;i++)
	{
		int lengtString = value[i].length(); //if compared string is not equal no need to compare
		if(len== lengtString) {
			if(find ==value[i])
			{
				System.out.println("SuccessFul"); // if condition satisfied print successful

			}
			else
			{
				System.out.println("UnSuccessful");
	        }
		
					
	}
		

		
    }


	
	}
	
	}

