package main.java;

public class ExpressionsStatementsBlocks {

	public void someExpressions() {

		boolean result = false; // assign false to result it's an expression

		String[] arrayString = {}; // assign empty array to arrayString it's an expression

		arrayString[0] = "a"; // assign "a" to position 0 of arrayString it's an expression

		if (2 == 2) { // compare 2 with 2 having result true it's an expression
			System.out.println("true"); // call method that will print "true" it's an expression
		}

		int resultInteger = 1 + 1; // assign 1 + 1 to "result" variable it's an expression

		System.out.println("The value is: " + arrayString[0]); // concatenate "the value is" with position 0 of
																// arrayString it's an expression

	}

	public void someStatements() {

		int value = 1; // declaration statement

		value++; // addition of ";" makes this a sentence

		Object object1 = new Object(); // object creation statement

		System.out.println("Hello world"); // method invocation statement

		value = 3; // assignment expression plus ";". Using of ";" makes this a sentence

		if (2 == 2) { // control flow statement

			System.out.println("true");

		}

	}

	public void someBlocks(final String arg) {

		String value = arg;

		if (arg.equals("a")) { // begin block 1
			System.out.println("Value is a");
		} // end block 1
		
		else { // begin block 2
			
			System.out.println("Value is different of a");
		} // end block 2

	}

}
