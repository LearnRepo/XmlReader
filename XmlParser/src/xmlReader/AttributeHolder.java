package xmlReader;

public class AttributeHolder {
	public String[] AttributeList = new String[0];
	private int countAttribute;
	public void AttributeSender(String Attribute)
	{
		String[] temp = AttributeList;
		countAttribute++;
		AttributeList = new String[countAttribute];
		for(int i =0;i<temp.length;i++)
		{
			AttributeList[i] = temp[i];
		}
		AttributeList[countAttribute-1]=Attribute;
	}
}
