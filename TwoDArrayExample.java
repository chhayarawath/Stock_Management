package day8_2darray_strings;
//different ways of declaring 2 d array
public class TwoDArrayExample {

	public static void main(String[] args) {
		
		int a[][]= new int[3][4];
		
		int b[][]= new int[4][];//correct column can be left blank
		
		//int c[][]= new int[][3];//error rows cannot be  left blank 
		//int h[2][3]; compile time error
		
		
		//---------------------
		int h[][]; //correct		
		h= new int[3][4]; //correct
		
		//-----------------
		int k[] = {3,4,45,5,6,};
		
		
		int m[][]=    {{1,2,3,4,5}
		             ,{34,5,6,7,7}};
		//-------------3* 3 matrix----------------
		
		int g[][]= {{3,4,5},
				    {6,7,8},
				    {4,5,67} 
				      
				    } ;
		 
	//---------- jagged array----
	
	int j[][]= {{22,33,44,55},
			    {23,5,5},
			     {33,55}};
		

	 

}}
