package demo;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Assignment operators *= && !=*
		int a=100; int b=200;
		String str="hello"; String str1="java";
//  Arithmetic operators *+,-,*,/,%*	
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(str+str1);
//	Incremental Operators 
		int c=1;
		//System.out.println(c);
		//System.out.println(c+=4);
		System.out.println(c++);
		System.out.println(c);
		System.out.println(--c);
		System.out.println(c);
		
		System.out.println(c+=5);//6
		System.out.println(c-=5);//1
		System.out.println(c+=4);//5
		System.out.println(c*=5);//25
		System.out.println(c/=5);//5
		System.out.println(c%=5);//0
		
// Comparison operators  boolean(true and false)
		 System.out.println(a==b); //False
		 System.out.println(a!=b); //True
		 System.out.println(a>b);//False
		 System.out.println(a<b);//true
		 System.out.println(a>=b);//false
		 System.out.println(a<=b);//true
		 
// logical operators  (&&,||,!)
		 System.out.println(a<=b && a>=b);//False
		 System.out.println(a<=b || a>=b);//true
		 System.out.println(a<=b ||a>=b && a<b && a>b||a==b && a!=b) ;//True
		 System.out.println(!(a<=b ||a>=b && a<b && a>b||a==b && a!=b)) ;//False
		 
//Ternary operators
		 System.out.println(a<b ? a:b);//true
		 System.out.println(a<b ? true:false);//true
		 System.out.println(a<b ? a:false);//true
		 System.out.println(a==b ? a:false);//false
		 
		 
		 
		
		
		
	}

}
