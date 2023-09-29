import java.util.Scanner;

class calculator{
	public static void main(String args[]){
		boolean t=true;
		do { System.out.println("1 = addition");
		   	System.out.println("2 = subtraction");
		   	System.out.println("3 = multiplication");
		   	System.out.println("4 = division");
		   	System.out.println("5 = exit");
		   	
		   	System.out.println("enter choice:");
		   	Scanner s = new Scanner(System.in);
		   	int choice = s.nextInt();

		   			double a;
		   			double b;
			
		   	switch(choice){
		   		case 1: System.out.println("Enter the numbers :");
		   			double sum;
		   			a = s.nextDouble();
		   			b = s.nextDouble();
		   			sum=a+b;
		   			System.out.println("Sum is :"+sum);
		   			break;
		   			
		   		case 2: System.out.println("Enter the numbers :");
		   			double sub;
		   			a = s.nextDouble();
		   			b = s.nextDouble();
		   			sub=a-b;
		   			System.out.println("diffrence is :"+sub);
		   			break;
		   			
				case 3:System.out.println("Enter the numbers :");
					double mul;
					a = s.nextDouble();
		   			b = s.nextDouble();
		   			mul=a*b;
		   			System.out.println("product is :"+mul);
		   			break;
		   			
				case 4: System.out.println("Enter the numbers :");
					double div;
					a = s.nextDouble();
		   			b = s.nextDouble();
		   			if(b==0){
		   			System.out.println("divison by 0 is not possible");
		   			break;}
		   			else{
		   			div=a/b;
		   			System.out.println("quotient is :"+div);
		   			break;}
		   		
		   		case 5:t=false;
		   			break;
		   		default: System.out.println("Invalid input choice");
		   		
		   		}
		   		}while(t);
		   		}
		   		}
		   		
		   			
		   		
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   			
		   	
			
			
			
