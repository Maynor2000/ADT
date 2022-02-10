package reccursividad;
public class Suma {
	static int c = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(serieGauss(2));
	}
	public static int serieGauss(int n) {
		if(n>1) {
			return serieGauss(n-1);
		}else {
			return 1;
		}
	}
}
