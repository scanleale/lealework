import java.util.Scanner;

public class qiuhemain {

	public static void main(String args[])  throws Exception
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			int []l=new int[n];
			int []r=new int[m];
			for (int i = 0; i < n; i++) {
				l[i]=sc.nextInt();
				
			}
			for (int j = 0; j < m; j++) {
				r[j]=sc.nextInt();
				
			}
			int []pow=new int[n*m];
			for (int k=0;k<n;k++)
			{
				
				for(int p=0;p<m;p++)
				{
					pow[k*m+p]=l[k]^r[p];
				}
			}
			for (int t=0;t<m*n-1;t++)
			{
				if(pow[t]>pow[t+1])
				{
					pow[t+1]=pow[t];
				}
			}
			System.out.println(pow[n*m-1]);
			sc.close();
			
		}

}
