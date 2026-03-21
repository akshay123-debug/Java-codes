package loops;
//class library{
//	int user_id;
//	String book;
//	
//	                        //  CLASS & OBJ CREATION  //
//}
//
//public class oops {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		library info=new library();
//		info.user_id=1;
//		info.book="ak";
//		info.user_id=2;
//		System.out.println(info.user_id);
//		System.out.println(info.user_id);
//
//	}
//
//}

                             //   METHOD CREATION    //

//public class oops {
//	// METHOD HEADER  //    PARAMETRS/ARGUMENTS
//	  static int sod     (int num1,int num2,int num3) {  // INITIALIZE HEADER AND (PARAMETERS)
//		int sum;       // method name cant be a variable so create new variable
//		sum=num1+num2+num3;                      // METHOD BODY
//		return sum;
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	    int sum=sod(50,20,30);           // ASSIGN VALUES WITH HEADER NAME TO VARIABLE NAME    
//		System.out.println(sum);               // CALL VARIABLE
//		int sum2=sod(50,10,70);
//		System.out.println(sum2); 
//
//	}
//
//}                              
                                 // wlcm inside box in methods //
 
//public class oops{
//static void method(){
//	System.out.println("******************");
//	System.out.println("**              **");
//	System.out.println("**    welcome   **");
//	System.out.println("**              **");
//	System.out.println("******************");
//}
//public static void main(String[] args) {
////	// TODO Auto-generated method stub
//	   method();
//}
//}

                                       // boolean two digits //
//public class oops{
//	public static boolean istwodigit(int no) {
//		
//		if(no>= 10) {
//			return true;
//			
//		}else {
//			return false;
//		}
//		
//	}
//	public static void main(String[] args) {
//////	// TODO Auto-generated method stub
//          System.out.println(istwodigit(20));
//    
//}
//}
							// AVG OF TWO NUM USING CONSTRUCTOR 
//public class oops{
//	
//	static int avg(int n1,int n2) {
//	    int sum=(n1+n2)/2;
//		return sum;
//	}
//	
//	
//	public static void main(String[] args) {
//		int result=avg(10,20);
//		
//		System.out.println(result);
//		
//	}
//}

     					// RECURSION IN FIBONACCI SERIES //

public class oops{
	static int fib(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		
		return fib(n-1)+fib(n-2);
	}
	
	
	
	
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++)
			System.out.println(fib(i));
		}
	
	}








