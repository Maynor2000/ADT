package tree;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<String> arbol = new BinaryTree<>();
		arbol.insert("maynor");
		arbol.insert("alvarez");
		arbol.insert("acopa");
		arbol.insert("higo");
		arbol.insert("zorro");
		System.out.println("higo".compareTo("alvarez"));
		//arbol.insert(20);
		//arbol.insert(3);
		//arbol.insert(40);
		//arbol.insert(6);
		//arbol.insert(60);
		arbol.recursive(arbol.getRoot());
	}

}
