package basic;

public class swapping {
	 public static void main(String[] args) {   
		 int first = 120, second= 220;     
		 System.out.println("--Before swap--"); 
		 System.out.println("First number = " + first); 
		 System.out.println("Second number = " + second);    
		    float temporary = first;         
		    first = second;        
		    second = (int) temporary;       
		    System.out.println("--After swap--");     
		    System.out.println("First number = " + first);   
		    System.out.println("Second number = " + second);    
		    
	 }
}
