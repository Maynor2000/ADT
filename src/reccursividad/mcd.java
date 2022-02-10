package reccursividad;

public class mcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mcd(12, 2));

	}
	public static int mcd(int a, int b) {
		if(b<a && a%b==0)return b;
		else if(b>a)return mcd(b,a);
		else return mcd(b,a%b);
	}

}
