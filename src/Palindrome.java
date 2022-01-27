
public class Palindrome {

	public static void main(String[] args) {
		int a=121,b,c=0;
		int t=a;
		while(a>0)
		{
			b=121%10;
			
			
		
		     a=a/10;
		     
		    
		     c=c*10+a;
			
		}
		if(t==c)
		{
			System.out.println("it is a palandrome-"+c);
		}
		else
		{
			System.out.println("it is not a palandrome-"+c);
		}
	}

}
