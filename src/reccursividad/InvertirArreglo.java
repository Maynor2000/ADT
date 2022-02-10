package reccursividad;

public class InvertirArreglo {
	public static void main(String[] args) {
		long posicion = 100L;
		//49663064
		//-1604831125
		//
		//System.out.println(fibR(posicion));
		int pos = hasfib("12df565fvvhgvhj1s651fsa");
		System.out.println(pos);
	}
	public static int fibI(int n) {
		n = n-1;
		int fn1 = 1,fn2 = 0, fn = 0;
		int cont = 0;
		while(cont!=n) {
			fn = fn1 +fn2;
			fn2 = fn1;
			fn1 = fn;
			cont++;
		}
		return fn;
	}
	public static int hasfib(String value) {
		int c = 0;
		for(byte a:value.getBytes())c+=a;
		return fibI(c);
	}


}
