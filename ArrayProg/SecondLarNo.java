package ArrayProg;

public class SecondLarNo {

	public static void main(String[] args) {
		int []a= {6,8,2,4,3,1};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println("second largest no:"+ a[1]);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		String s1="Abhishk Raj";
		String[] s2= s1.split(" ");
		String rev=" ";
		for(int i=s2.length-1; i>=0; i--){
		 rev=rev+ s2[i]+" ";// Raj Abhishek
		}
		System.out.print(rev);

	}


	}


