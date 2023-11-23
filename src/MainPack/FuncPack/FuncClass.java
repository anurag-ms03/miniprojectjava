package MainPack.FuncPack;

public class FuncClass {
public int fact(int n) {
	 if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
		 }    
public int sumUpToN(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
	return sum;
}
public void EvenorOdd(int n) {
	if(n%2==0) {
		System.out.println("the number "+n+"is Even");
	}
	else
	System.out.println("The number "+n+"is Odd");
}
}