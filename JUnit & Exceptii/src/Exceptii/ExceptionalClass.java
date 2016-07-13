package Exceptii;

public class ExceptionalClass {

	public static void main(String[] args) {
		
//		outOfMemory();
//		stackOverflow();
	}

	/* Causes OutOfMemoryError */
	static void outOfMemory(){
		int a[] = new int[1000000000];
		a[1] = 7;
	}
	
	/* Causes StackOverflowError */
	static void stackOverflow(){
		stackOverflow();
	}
}
