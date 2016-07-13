package Exceptii;

import java.util.List;

class OverflowException extends Exception{};
class UnderflowException extends Exception{};


public class Calculator {

	/* adds two numbers, x and y */
	public int add(int x, int y) throws OverflowException, UnderflowException{
		if( x > 0 && y > 0 && x+y < 0){
			throw new OverflowException();
		}
		
		if( x < 0 && y < 0 && x+y > 0){
			throw new UnderflowException();
		}
		return x+y;
	}
	
	/* divides two numbers, x and y */
	public int divide(int x, int y){
		return x/y;
	}
	
	/* calculates the arithmetic average of a list */
	public int average(List<Integer> lst){
		int avg = 0;
		for(int i = 0; i < lst.size(); i++){
			avg += lst.get(i);
		}
		
		return avg/lst.size();
	}
}
