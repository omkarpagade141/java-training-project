package training_project.basic;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		int num=10;
		
		
		switch (num) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wenesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
		default:
			System.out.println("Sunday");
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	}

}
