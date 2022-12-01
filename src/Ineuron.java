
public class Ineuron {

	public static void main(String[] args) 
	{ 
		int n = 7;
	
		for(int i=0 ; i< n ; i++)
		
		{
			
			for(int j=0 ; j<n ; j++)
		{ // for print I 
				if(( i==0 && i>n || j==(n-1)/2 || i==n-1 && i>n))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		
		}	
			
			for(int j=0 ; j<n ; j++)
		{ // for print N 
				if((j==0 || i==j || j== n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		}
			
			for(int j=0 ; j<n; j++)
			{ // for print E
				if((j==n/4|| i==0 && j>n/4|| i== n/2 && j>n/4 || i==n-1 && j>n/4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for (int j=0 ; j<n ;j++)
			{ // for print U 
				if(j==n/4 && i<n-1 ||  i== n-1 && j>n/4 && j<n-1|| j==n-1 && i<n-1)
				{
					System.out.print("*");
				}
				else  
				{
					System.out.print(" ");
				}
			}
			for (int j=0 ; j<n ;j++)
			{ // for print R
				if    (   j==0 ||
						  i==0 &&j<(n-1)/2||
						  i== (n-1)/2 && j< (n-1)/2||
						  j==(n-1)/2 && i<(n-1)/2 && i>0 ||
						  i-j==(n-1)/2
						) 
				{
					System.out.print("*");
				}
				else  
				{
					System.out.print(" ");
				}
			}
				for (int j=0 ; j<n ;j++)
				{ // for print o
					if(i==0 && j> n/4 && j <(3*n)/4
							|| (j==0 && i > 0 && i< n-1 )
							|| (i==n-1 && j>n/4 && j <(3*n) /4 )
							|| (j==n-1 && i<n-1 && i>0 )
					  )

					{
						System.out.print("*");
					}
					else  
					{
						System.out.print(" ");
					}
					}
				 for 
				 (int j=0 ; j<n;j++)
				 { //  for print  N 
					 if ((j==0 || i==j || j== n-1))
				 {
					 System.out.print("*");
				 }
				 else
					  {
					 System.out.print(" ");
					  }
				 }
		    System.out.println(" ");
	    }
  }
	
	
}



