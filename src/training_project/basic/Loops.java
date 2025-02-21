package training_project.basic;

public class Loops {
	
	public static void main(String[] args) {
//	 2,3,5,7,......
		int num=18;
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				isPrime=false;
				
				break;
				
			}
			System.out.println(i);
			
			
		}
		
		if(isPrime) {
			System.out.println(num +" is prime number");
		}else {
			System.out.println(num+ " is not prime");
		}
		
	}

}
