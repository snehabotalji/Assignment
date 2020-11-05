public class StringCal {
	
int Add(String numbers) throws InvalidNumber
{
	int size= numbers.length();
	if(size>0 && numbers!=null)
	{
		String s1[] =numbers.replaceAll("\n","0").replaceAll("//","0").split(";");
		int sum = 0;
		int temp=0;
		String s="";
		for(int i=0;i<s1.length;i++)
		{
			temp=Integer.parseInt(s1[i]);
			if(temp<0) {
				s=s+" "+temp;
			}
			else
				if(temp>=0 && temp<=1000)
				{
			sum=sum+temp;
		}
		}
		if(s.length()>0)
		{
			throw new InvalidNumber(s);
		}
		return sum;
	}
	return 0;
}
public static void main(String[] args) throws InvalidNumber {
	StringCal  scal=new StringCal();
	System.out.println(scal.Add("//;1;\n1;2;6;1002"));
}
}
