package practice;

import java.io.IOException;

 public class primenumber1 {

	public static void main(String[] args) throws IOException {
		int num=19;
	int	count =0;
	
	for(int i=1;i<=num;i++) {
		if(num%i==0)
			count++;
	}
     if(count==2) {
    	 System.out.println("it is a prime number");
     }
     else {
    	 System.out.println("it is not a prime number");
     }
	}

	}


