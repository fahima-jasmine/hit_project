package basic;

public class Bird {
	int age; String name; 
	Bird() 
	{ 
		System.out.println("this is the parrot"); 
		}  Bird(String x) 
	{  
			name=x; 
	System.out.println("this is the "+name); 
	} 
	 
	 Bird(int y,String z)  
	 {  
		 age=y;  
	 name=z; 
	 
	 System.out.println("this is the "+age+"years\t"+name); 
	 }
public static void main(String args[])
{  Bird a=new Bird();
Bird b=new Bird("maina");
Bird c=new Bird(20,"sparrow");
}
} 
	 

