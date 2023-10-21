package Interview;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=0;
      int b=1;
      int c;
      int n=10;
      System.out.println(a+"\n"+b);
      for(int i=3;i<=n;i++) {
    	  c=a+b;
    	  System.out.println(c);
    	  a=b;
    	  b=c;
      }
	}

}
