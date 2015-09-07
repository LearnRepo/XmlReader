package xmlReader;

public class FilterAttribute {
	public FilterAttribute(String str)
	{
		int i=0;
		String Attribute="";
		String CommitAttribute="";
		String AttributeData="";
		for(i=0;i<str.length();i++)
		if(str.charAt(i) == '<')
		{
			i++;
			if(str.charAt(i) == '-' ||str.charAt(i) == '?' || str.charAt(i) == '!')
			{
				while(str.charAt(i)!='>')
					i++;
			}
			else
			{
				while(str.charAt(i)!='>')//Start Define Attribute
				{
				if((str.charAt(i)>='a' && str.charAt(i)<='z') ||(str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='0' && str.charAt(i)<='9'))
				{
					Attribute = Attribute+str.charAt(i);
				}
				i++;
				} //Defined Attribute
				i++;
				CommitAttribute = "</"; //Commit Attribute Defining
				for(int k=0;k<Attribute.length();k++)
					CommitAttribute +=  Attribute.charAt(k); //Defined Commit Attribute
				CommitAttribute += '>';
				//data collecting
				while(true)
				{
					if(CommitAttribute.equals(str.substring(i,i+CommitAttribute.length())))
					{
						i+=CommitAttribute.length();
						break;
					}
					else
					{
						AttributeData+=str.charAt(i);
						i++;
					}
				}
				//Attribute Committed
				System.out.println(Attribute+" "+AttributeData);
			  }
		}
		else
		{
			System.out.print("Invaid XML File");
			break;
		}
	}
}
