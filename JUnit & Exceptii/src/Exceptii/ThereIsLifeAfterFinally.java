package Exceptii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThereIsLifeAfterFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader(new File("dummyFilename.fancyExtension"));
		} catch (FileNotFoundException e) {
			System.out.println("Of course it didn't find it -_-");
			return;
		}finally{
			System.out.println("Method returned, but you still see me!");
		}
	}

}
