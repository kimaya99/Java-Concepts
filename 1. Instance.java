
class Motorcycle {
	// instance variables
	String make;
	String color;
	boolean engineState;

   	 // instance behaviour defined by methods
	void startEngine(){
		if (engineState == true) {
			System.out.println("Started already");
		}
		else {
			engineState = true;
			System.out.println("Started now");
		}
	}

	void showAtts() {
    		System.out.println("This motorcycle is "+ color + " "  + make);
    		if (engineState == true)
       			 System.out.println("The engine is on.");
    		else 
    			System.out.println("The engine is off.");
  	}
}

class Instance {
	public static void main(String args[]){
		
		Motorcycle m = new Motorcycle();
		m.make = "Yamaha RZ350";
        	m.color = "yellow";
        	System.out.println("Calling showAtts...");
        	m.showAtts();

        	System.out.println("Starting engine...");
        	m.startEngine();

        	System.out.println("Calling showAtts...");
        	m.showAtts();

		System.out.println("Starting engine...");
		m.startEngine();

	}	
}

/* 
Calling showAtts...
This motorcycle is yellow Yamaha RZ350
The engine is off.
Starting engine...
Started now
Calling showAtts...
This motorcycle is yellow Yamaha RZ350
The engine is on.
Starting engine...
Started already
*/
