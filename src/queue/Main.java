package queue;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> cola = new Queue<>();
		cola.push("maynor");
		cola.push("aurora");
		cola.push("blanca");
		cola.push("josefina");
		System.out.println("---------foreach functional------------");
		cola.forEach((data)->{System.out.println(data);});
		System.out.println("---------foreach------------");
		for(String a:cola)System.out.println(a);

	}

}
