package Interview;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="hello";
       String rstr= " ";
       for(int i=str.length()-1;i>=0;i--) {
    	   rstr +=str.charAt(i);
       }
       System.out.println(rstr);
	}

}
