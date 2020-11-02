
public class Day2Bottle {
	public static int cold_bottle(int n ,int e)
	{
		int s=0, b=0;
		int a=n;
		while (a!=0)
		{
			s=s+a;
			a=(a+b)/e;
			b=n-(a*e);
			n=a+b;
			
		}
		return s;
	}
	public static void main(String[] args) {
		//int n=15, e=4;
				int s=cold_bottle(15,4);
				int s1=cold_bottle(9,3);
				System.out.println("day 1 example1");
				System.out.println("the s the no.of.cold pass as 9 and empty pass as 3 is :"+s1);
				System.out.println("day 1 example2");
				System.out.println("the s the no.of.cold pass as 15 and empty pass as 4 is :"+s);
				
		
	}

}
