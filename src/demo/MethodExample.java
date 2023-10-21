package demo;

public class MethodExample {
	
//method without parameters  without return
	 void addtion() {
		 System.out.println(100+200);
	 }
//method with parameters  without return	 
	 void subtraction(int a, int b) {
		 System.out.println("addtion:"+a+b);
	 }	 
////method with parameters  with return
	  int mulitiplication(int a,int b) {
		  return ( a+b);
	  }
////method without parameters  with return	  
	 short division() {
		 return (100+200);
	 }
	 
	  int multiplication(int a ,int b) {
		  System.out.println("multiplication:"+ a*b);
		  return a*b;
	  }
	  void multiplication1() {
		  System.out.println(100*200);
	  }
	  void mulitiplication2(int a,int b) {
		  System.out.println(a*b);
	  }
	  int multiplication2() {
		  
		  return (100*200);
		  
	  }

	public static void main(String[] args) {
	
		MethodExample MEX = new  MethodExample();
		 MEX.addtion();
		int result=MEX.multiplication(5, 6);
		System.out.println(result);
		
	}

}
