
public class AbstractClass{
	public static void main(String args[])
	{
        Contract rp = new Recipient();
        System.out.println(rp.calculateCost());
        rp.randomMethod();
   		
	}
}


abstract class Contract { // cannot be instantated
	
	public abstract int calculateCost(); // has abstract + normal methods
	 
	// some common methods across and some not common 
	
	public void randomMethod (){
		System.out.println("Abstract Classes are not strict."); 
	}
}

class Recipient extends Contract {
	public int calculateCost(){
       return 2*8;
	}
}

/*
Kimayas-MacBook-Pro:Desktop kimayadesai$ javac AbstractClass.java
Kimayas-MacBook-Pro:Desktop kimayadesai$ java AbstractClass
16
Abstract Classes are not strict.
*/





