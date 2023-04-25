
public class ReverseOfString {

	public static void main(String[] args) {
		
		String s1= "qlcadda";
		String rev="";
		int len=s1.length();
		for (int i = len-1; i>= 0; i--) {
			char ch=s1.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
		String s2= "My Name Is Abhi";
		String s3="";
		String []arr= s2.split("");
		for (int i = arr.length-1; i >=0 ; i--) {
			s3=s3+arr[i]+"";
		}
		System.out.println(s3);
	}
	
	

	
	}
	


