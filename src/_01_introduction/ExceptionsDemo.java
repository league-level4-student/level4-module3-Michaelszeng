package _01_introduction;

public class ExceptionsDemo {
	public static void main(String[] args) {
		// Exceptions are ways to allow your program to continue running 
		// in the event of unexpected behavior or input.
		// All exceptions extend from Java's Exception class.
		// You can make your own exceptions by making a class that 
		// extends Exception
		int x = 9;
		try {
			if (x == 9) {
				throw new Exception();
			}
			System.out.println("yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	//prints red stuff
			System.out.println("test 1 caught");
		}
		System.out.println(x);
		
		// 1. Call testMethod1 with a value less than 5.
		//    It should give you an error.
		//    This is because testMethod1 can potentially throw
		//    an Exception. The solution is to surround your
		//    call to testMethod1 with a try/catch block.
		//    In the catch block, put a print statement so you know
		//    if the code is being ran.
		try {
			testMethod1(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	//prints red stuff
			System.out.println("test 1 caught");
		}
		
		// 2. Now call testMethod1 with a value greater than 5. 
		//    Running your program should not print the statement
		//    in the catch block.
		//    You can use the Exception class's printStackTrace() method
		//    to print a list of methods that are currently in scope.
		try {
			testMethod1(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("test 2 caught");
		}
		// 3. Create a new class called CustomException that extends Exception.
		//    Add a void method called terminate that simply calls System.exit(0);
		// 5. Call testMethod2 with a negative number in a try/catch block.
		//    In the catch block, call the terminate method using the 
		//    CustomException object.
		//    This demonstrates how custom exception classes can be used to
		//    handle exceptions in unlimited ways.
		try {
			testMethod2(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("terminating");
			CustomException.terminate();
		}
	}
	
	public static void testMethod1(int x) throws Exception {
		if(x < 5) {
			throw new Exception();
		}
	}
	
	// 4. Create a static void method called testMethod2(int x) that throws
	//    a CustomException if x is negative.
	public static void testMethod2(int x) throws Exception {
		if (x<0) {
			throw new Exception();
		}
	}
}
class CustomException extends Exception{
	public static void terminate() {
		System.exit(0);
	}
}
