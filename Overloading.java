class OverloadClass{
	void add(int x, int y){
		System.out.println(x+y);
	}

	void add(int x,int y,int z){
		System.out.println(x+y+z);
	}
}

class Overloading{
	public static void main(String args[]){
      OverloadClass obj1 = new OverloadClass();
      obj1.add(2,3); // 5 
      obj1.add(2,2,2); // 6
	}
}