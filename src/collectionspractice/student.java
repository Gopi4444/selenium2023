package collectionspractice;

public class student {
	int rollno ;
	 static String collegenane ="srisai college";
	  student(int n) {
		// System.out.println("the roll number is:"+rollno);
		 rollno=n;
	 }
	  void display() {
		 System.out.println("the roll number is:"+rollno+" \n "+"college name is :"+collegenane);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1= new student(1);
		student s2= new student(2);
		
		//s1.show(111);
		s1.display();
		//s2.show(112);
		s2.display();
		
		}

}
