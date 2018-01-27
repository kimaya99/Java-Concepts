class Parent {
	int value1 = 1;
	int value2 = 2;

	int method1(){
     		return 5;
	}

	int method2(){
		return 6;
	}	
}

class Child extends Parent {
	int value3 = 3;
	int value4 = 4;

	int method1(){
	 	return 7;
	}
   	 
	int method3(){
   	 	return 8;
   	}
}

class Inheritance {
	public static void main(String args[]) {
        Parent parent1 = new Parent();
        Child child1 = new Child();
        System.out.println(child1.value1); // Inheritance
        System.out.println(child1.method2());     
	}
}
