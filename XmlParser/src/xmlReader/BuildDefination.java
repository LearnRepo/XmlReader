package xmlReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class BuildDefination {
	
	// reader file
	public BuildDefination(String filename) throws IOException
	{
		FileReader inputStream=null;
		PrintWriter outputStream=null;
		char c;
    	StringBuilder str = new StringBuilder();
        
        try
        {
        	inputStream = new FileReader(filename);
        	outputStream = new PrintWriter(new FileWriter("D:\\git2\\XmlParser\\src\\xmlReader\\OSampleXml"));
        	while ((c = (char)inputStream.read()) != (char)-1)
        		{
        		 
        			if(c!=' '&&c!='\n'&&c!='\t')
        			 str = str.append(c);
        		} 
        	outputStream.print(str);
        }
        finally
        {
        	 if (inputStream != null) 
        	 {
                 inputStream.close();
             }
        	 if (outputStream != null) 
        	 {
                 outputStream.close();
             }
        }
	}


}
