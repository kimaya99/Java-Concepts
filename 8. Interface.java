
public class Interface {
	public static void main(String args[])
	{
		Contract rp = new Recipient();
        System.out.println(rp.calculateCost());
        rp.printCost();
	}
}

interface Contract {
	 public int calculateCost();
	 public void printCost();
}

class Recipient implements Contract {
	public int calculateCost(){
       return 2*8;
	}

	public void printCost(){
       System.out.print("Interface Implemented");
	}
}

/*

Kimayas-MacBook-Pro:Desktop kimayadesai$ javac Interface.java
Kimayas-MacBook-Pro:Desktop kimayadesai$ java Interface
16
Interface Implemented
*/