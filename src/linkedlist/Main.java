package linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lista = new LinkedList<>();
		System.out.println("---------------inserta al final---------------");
		lista.append("maynor");
		lista.append("aurora");
		lista.append("blanca");
		lista.append("en 4");
		System.out.println("---------------inserta al inicio---------------");
		lista.add("primero");
		lista.add("colar");
		System.out.println("---------------inserta en el indice dado---------------");
		lista.add(1,"yoooo");
		lista.add(1,"seya");
		System.out.println("---------------for---------------");
		for(int i=1;i<=lista.size();i++) {
			System.out.println(lista.get(i));
		}
		//lista.iterator();
		System.out.println("---------------foreach antiguo---------------");
		for(String a:lista) {
			System.out.println(a);
			//System.out.println("hola");
		}
		System.out.println("--------------foreach moderno----------------");
		lista.forEach((data)->{System.out.println(data);});
		System.out.println("--------------next prev----------------");
		System.out.println(lista.next());
		System.out.println(lista.next());
		System.out.println(lista.prev());
		System.out.println(lista.prev());
		System.out.println("--------------remove----------------");
		System.out.println("elemento removido: "+lista.remove(1));
		lista.forEach((data)->{System.out.println(data);});
	}

}
