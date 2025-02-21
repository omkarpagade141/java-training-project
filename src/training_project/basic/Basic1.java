package training_project.basic;

public class Basic1 {
	
	String  str1="ddf";
	
	public void addToDatabase(String firstName,String lastName, int rollNo) {
		String sqlQuery= "insert into studentTable (firstName,lastName,rollNo) values ("+firstName+","+lastName+","+rollNo+" );";
		System.out.println(sqlQuery);
		}
	
	
	public void getData() {
		String firstName="Omkar";
		String lastName="Pagade";
		
		System.out.println(firstName+ lastName); 
	}
	
	
	public static void main(String[] args) {
		Basic1 basic=new Basic1();
		basic.addToDatabase(basic.str1,"Pagade",01);
		basic.getData();
		
		//opreators  +, -,*,/      =, == ,!=, <,>, && , ||, %
	}
	

}
