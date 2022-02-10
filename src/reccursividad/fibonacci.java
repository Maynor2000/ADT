package reccursividad;

public class fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacciR(2));

		System.out.println(sumaNEnteros(5));
		


	}
	public static int fibonacciR(int n) {
		if(n<2)return n;
		else return fibonacciR(n-1)+fibonacciR(n-2);
	}
	public static int sumaNEnteros(int n) {
		if(n<2)return n;
		else return sumaNEnteros(n-1)+n;
	}


}
