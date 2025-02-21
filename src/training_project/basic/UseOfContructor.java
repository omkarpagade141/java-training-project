package training_project.basic;

public class UseOfContructor {
	
	static String name;
	static int age;
	
	UseOfContructor(){	
	}
	
	UseOfContructor(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		
		UseOfContructor obj1=new UseOfContructor("Omkar",23);
		
		System.out.println(obj1.name);
		
		
		
		UseOfContructor obj2=new UseOfContructor("Yash",25);
		
		System.out.println(obj2.name);
		 
	}

}
