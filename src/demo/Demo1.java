package demo;

public class Demo1 {
	
	
	private String studentName;
	private int rollNo;
	private char div;
	private boolean bool=true;
	
	
	
	
	public Demo1(String studentName, int rollNo, char div) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.div = div;
	}
	
	public Demo1() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public char getDiv() {
		return div;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	
	
	
	

}
