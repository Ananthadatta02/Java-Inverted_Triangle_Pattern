package number_patterns;

/*
12345
1234
123
12
 */
public class InvertedRightAngledTriangle 
{
	public static void main(String[] args) 
	{
		int a = 5;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=a;j++)
				System.out.print(j);
			a--;
			System.out.println();
		}
	}
}
