package Interview;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int count=0;
		if(num>1) {
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
}
