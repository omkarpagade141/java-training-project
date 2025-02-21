package demo;

import helper.MailFormatter;

public class Demo2 {
	
	
	
	
	
	public static void main(String[] args) {
		
		String s1="user.emsssssssssssssssssssssssssssssail@email.com";
		
		 System.out.println(MailFormatter.replaceStar(s1));
		
//		int atPosition=s1.indexOf("@");
//		int dotPosition=s1.lastIndexOf(".");
//		
//		
//		
//		
//		
//	
//		String s2="";
//		
//		for(int i=0;i<s1.length();i++) {
//			if(i==0) {
//				s2=s2+s1.charAt(i);	
//			}else if(i<atPosition) {
//				s2=s2+"*";
//			}
//			else if(i==atPosition) {
//				s2=s2+"@";
//			}else if(i>atPosition && i<dotPosition) {
//				s2=s2+"*";
//			}else {
//				s2=s2+s1.charAt(i);
//			}
//		}
//		System.out.println(s1);
//		System.out.println(s2);
//		
		
		
	
	}

}
