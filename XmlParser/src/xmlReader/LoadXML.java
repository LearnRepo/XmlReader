package xmlReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoadXML {
	
	// reader file
	public LoadXML(String filename) throws IOException
	{
		FileReader inputStream=null;
		PrintWriter outputStream=null;
		char c;
    	String str = new String();
        //Don't Go with this input output file mesh
        try
        {
        	inputStream = new FileReader(filename);
        	outputStream = new PrintWriter(new FileWriter(System.getProperty("user.dir")+"\\src\\xmlReader\\SampleXml"));
        	while ((c = (char)inputStream.read()) != (char)-1)
        		{
        		 
        			if(c!=' '&&c!='\n'&&c!='\t'&&c!='\r')
        			 str = str+c;
        		} 
        	outputStream.print(str);
        	//System.out.println(str.charAt(601));
        	new FilterAttribute(str);
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
        //Here "str" string you are looking for
	}


}
