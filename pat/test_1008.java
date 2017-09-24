package pat;
import java.util.*;
public class test_1008 {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int N,M;
		N=in.nextInt();
		M=in.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=in.nextInt();
		if(N>=M)
		{
			if(N==1)
			{
				System.out.println(arr[0]);
				return;
			}	
			if(N==M)
			{
				for(int i=0;i<N-1;i++)
					System.out.print(arr[i]+" ");
				System.out.println(arr[N-1]);
				return;
			}
			for(int i=N-M;i<N;i++)
				System.out.print(arr[i]+" ");
			for(int i=0;i<N-M-1;i++)
				System.out.print(arr[i]+" ");
			System.out.println(arr[N-M-1]);
		}
		else{
			M=M-N;
			if(N==1)
			{
				System.out.println(arr[0]);
				return;
			}	
			if(N==M)
			{
				for(int i=0;i<N-1;i++)
					System.out.print(arr[i]+" ");
				System.out.println(arr[N-1]);
				return;
			}
			for(int i=N-M;i<N;i++)
				System.out.print(arr[i]+" ");
			for(int i=0;i<N-M-1;i++)
				System.out.print(arr[i]+" ");
			System.out.println(arr[N-M-1]);
		}
	}
}
