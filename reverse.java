import java.util.Scanner;

class reverse{
	public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		int i;
		for(i=num;i>0;i=i/10){
			
			int rev = i%10;
			sum = sum*10+rev;
			
			}
			
		System.out.println("The number reversed is :" +sum );	
		
		}}
			
