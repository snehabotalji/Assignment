public class StringCal {
	
int Add(String numbers)
{
	int size= numbers.length();
	if(size>0 && numbers!=null)
	{
		String s1[] =numbers.split(",");
		int sum = 0;
		for(int i=0;i<s1.length;i++)
		{
			sum=sum+Integer.parseInt(s1[i]);
		}
		return sum;
	}
	return 0;

}
public static void main(String[] args) {
	StringCal  scal=new StringCal();
	System.out.println(scal.Add("1,2"));
}
}
