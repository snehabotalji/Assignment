public class StringCal {
	
int Add(String numbers) throws InvalidNumber
{
	int size= numbers.length();
	if(size>0 && numbers!=null)
	{
		String ss[]=numbers.replace("//", "").replace("[","").replace("]","").split("\n");
		StringBuffer s3 =new StringBuffer();
		for(int k=0;k<ss[0].length();k++)
		{
		s3=s3.append(ss[0].charAt(k));
		}
		String s1[] =ss[1].split("["+s3+"]");
		//System.out.println(s3);
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
	System.out.println(scal.Add("//[*][%]\n1%2*6*1%2"));
}
}
