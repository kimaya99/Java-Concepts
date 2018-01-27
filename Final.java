/* Final 
variable -> constant 
class -> cannot be subclassed 
method -> cannot be overridden
*/

class Final {
   public static void main(String args[]){
   	final int value1 = 23;

   	//value1 = 56;  // observation 1

    FinClass f = new FinClass();
    f.print();

    SubClass s = new SubClass();
    s.print();
   }
}

final class FinClass {
	void print(){
	System.out.println("FinClass here");
	}
}

class SubClass extends FinClass {  // observation 2
	void print(){
	System.out.println("SubClass here");
	}
}

/* OBSERVATION 1
Kimayas-MacBook-Pro:Desktop kimayadesai$ javac Final.java
Final.java:5: error: cannot assign a value to final variable value1
   	value1 = 56;
   	^
1 error */

/* OBSERVATION 2 
Final.java:27: error: cannot inherit from final FinClass
class SubClass extends FinClass {
                       ^
1 error
*/