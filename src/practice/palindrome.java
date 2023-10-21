package practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner obj= new Scanner(System.in);
      System.out.println("enter the number");
               int num=obj.nextInt();
       int Onum= num;
       int rnum =0;
       while(num!=0) {
    	   int rem=num%10;
    	    rnum=rnum*10+rem;
    	    num=num/10;
       }
       if(Onum==rnum) {
    	   System.out.println("it is palindrome");
       }
       else {
    	   System.out.println("it is not a palindrome");
       }
	}

}
