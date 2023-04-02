package day7_arrays;

public class BinarySearchExample {

	public static void main(String[] args) {
		
		 int y[]= { 11 ,22,33,44,55,66,77,88};
		
		 int s= 11;
		 int f=0;
		 int l=y.length-1;// 7
		 int count =1;
		 while(f<=l)
		 {
			 int mid= (f+l)/2;
			 if(y[mid]==s)
			 {
				 System.out.println("record found "+count +"  "+ mid );
				 break;
			 }
			 else if(y[mid]<s)
				 f= mid+1;
			 else 
				 l= mid-1;
			 
			 count++;
		 }
	
		 if(f>l)
			 System.out.println("record not found " +count);
		 	
	}

}
