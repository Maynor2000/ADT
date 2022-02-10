package stack;

public class main {

	public static void main(String[] args) {
		
		Stack<String> pila = new Stack<>();
		pila.push("maynor");
		pila.push("alvarez");
		pila.push("acopa");
		System.out.println(pila.size());
		System.out.println(pila.pop());
		System.out.println("---------foreach----------");
		pila.forEach((data)->{System.out.println(data);});

	}

}
