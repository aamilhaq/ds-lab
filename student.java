import java.util.Scanner;

class student{
	public static void main(String args[]){
		System.out.println("Enter your marks:");
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		
		if((marks>=90)&&(marks<=100)){
			System.out.println("grade is A");}
			
		else if((marks>=80)&&(marks<90)){
			System.out.println("grade is B");}
			
		else if((marks>=70)&&(marks<80)){
			System.out.println("grade is C");}	
			
		else if((marks>=60)&&(marks<70)){
			System.out.println("grade is D");}
			
		else if((marks>=0)&&(marks<60)){
			System.out.println("grade is F");}		
			}
		}
		
