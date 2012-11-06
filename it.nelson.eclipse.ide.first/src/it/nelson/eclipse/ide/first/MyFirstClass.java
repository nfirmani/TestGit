package it.nelson.eclipse.ide.first;



public class MyFirstClass {

	private static final String HELLO = "Hello Eclipse!";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(HELLO);
		Person persona = new Person("nelson", "firmani");
	    int sum = 0;
	    sum = calculateSum(sum);
	    System.out.println(sum);  
	    // TODO da completare
	}

	private static int calculateSum(int sum) {
		for (int i = 0; i <= 100; i++) {
	      sum += i;
	    }
		return sum;
	}

}
