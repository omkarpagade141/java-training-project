package helper;

public class MailFormatter {

	
	public static String replaceStar( String s1) {
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(i==0) {
				s2=s2+s1.charAt(i);	
			}else if(i<s1.indexOf("@")) {
				s2=s2+"*";
			}
			else if(i==s1.indexOf("@")) {
				s2=s2+"@";
			}else if(i>s1.indexOf("@") && i<s1.lastIndexOf(".")) {
				s2=s2+"*";
			}else {
				s2=s2+s1.charAt(i);
			}
		}
		return s2;
	}
}
