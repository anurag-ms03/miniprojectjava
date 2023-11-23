package MainPack;
import java.util.Scanner;
import MainPack.ArithPack.ArithClass;
import MainPack.FuncPack.FuncClass;
import MainPack.RelatePack.RelateClass;
public class MainClass {
public static void main(String[] args) {
	ArithClass a=new ArithClass();
	RelateClass r=new RelateClass();
	FuncClass f=new FuncClass();
	int num1=0,num2=0;
	boolean loop=true;
	while(loop) {
		System.out.println("1.Arithematic");
		System.out.println("2.Relational");
		System.out.println("3.Functional");
		System.out.println("4.Exit");
		System.out.println("Select an option: ");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			boolean l1=true;
			while(l1){
				System.out.println("1.Addtion");
				System.out.println("2.Subtraction");
				System.out.println("3.Multiplication");
				System.out.println("4.Division");
				System.out.println("5.Modulo Division");
				System.out.println("6.Exit");
				System.out.println("Select an operation: ");
				int c=sc.nextInt();
				if (c!=6) {
				System.out.println("Enter two numbers ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				}
				switch(c) {
				case 1:
					System.out.println("the Sum of two numbers is "+a.Add(num1,num2));
					break;
				case 2:
					System.out.println("the Difference between two numbers is "+a.sub(num1,num2));
					break;
				case 3:
					System.out.println("the Product of two numbers is "+a.mul(num1,num2));
					break;
				case 4:
					System.out.println("the quotient of two numbers is "+a.div(num1,num2));
					break;
				case 5:
					System.out.println("the reminder of two numbers is "+a.mod(num1,num2));
					break;
				case 6:
					l1=false;
					break;
				default:
					System.out.println("Enter a valid choice ");
				}
				System.out.println();
			}
			break;
		case 2:
			boolean l2 = true;
			while(l2){
				System.out.println("1.CheckGreater");
				System.out.println("2.CheckSmaller");
				System.out.println("3.CheckEqual");
				System.out.println("4.Exit");
				System.out.println("Select an operation: ");
				int ce=sc.nextInt();
				if (ce!=4) {
				System.out.println("Enter two numbers ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				}
				switch(ce) {
				case 1:
					System.out.println("the Greater of two numbers is "+r.greater(num1,num2));
					break;
				case 2:
					System.out.println("the Smaller of two numbers is "+r.smaller(num1,num2));
					break;
				case 3:
					System.out.println(r.equal(num1,num2));
					break;
				case 4:
					l2=false;
					break;
				default:
					System.out.println("Enter a valid choice ");
					break;
				}
				System.out.println();
			}
			break;
		case 3:
			boolean l3 = true;
			while(l3){
				System.out.println("1.Factorial");
				System.out.println("2.Sum upto n numbers");
				System.out.println("3.Odd or Even");
				System.out.println("4.Exit");
				System.out.println("Select an operation: ");
				int cr=sc.nextInt();
				if(cr!=4) {
				System.out.println("Enter a number ");
				num1=sc.nextInt();
				}
				switch(cr) {
				case 1:
					System.out.println("the factorial of the number is "+f.fact(num1));
					break;
				case 2:
					System.out.println("the sum upto "+num1+" is "+f.sumUpToN(num1));
					break;
				case 3:
				    f.EvenorOdd(num1);
					break;
				case 4:
					l3=false;
					break;
				default:
					System.out.println("Enter a valid choice ");
					break;
				}
				System.out.println();
			}
			break;
		case 4:
			loop=false;
			break;
		default:
			System.out.println("Enter a valid choice ");
			break;
		}
		System.out.println();
	}
	System.out.println("Thank you for using the Application!!!");
	System.out.println("GoodBye!!!");
}
}
