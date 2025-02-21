package training_project.basic;

import java.util.Scanner;

public class Ifelse {
	
	
	public static void main(String[] args) {
		
		
		int age=25;
		int weight=80;
		boolean status=false;
		
		if(age>=20) {
			
			if(weight>=50) {
				status=true;
				System.out.println("eligible");
			}
			else {
				System.out.println("not eligible due to less weight then required");
			}
			
		}else {
			System.out.println("not eligible due to under age");
		}	
		
		
		if(status) {
			System.out.println("status is "+status +"  eligible");
		}else {
			System.out.println("status is "+status);
		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter marks");
//		int marks=sc.nextInt();
//		
//		if(marks>=90) {
//			System.out.println("A+");
//		}else if(marks<90 && marks >=70) {
//			System.out.println("A");
//		}else if(marks<70 && marks>=50) {
//			System.out.println("B");
//		}else {
//			System.out.println("C");
//		}
//		
	}

}
