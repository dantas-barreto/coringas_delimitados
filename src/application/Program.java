package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add(10);
		myObjs.add(5);
		
		List<? super Number> myNums = myObjs;	// Contravariância
		
		myNums.add(10);							// put - OK
		myNums.add(3.14);
		
		Number x = myNums.get(0);				// get - ERROR
	}
}
