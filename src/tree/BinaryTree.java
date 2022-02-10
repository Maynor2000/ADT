package tree;

import nodo.NodoTree;

public class BinaryTree<T extends Comparable<T>>{
	//propertis
	private NodoTree<T> nodo;
	private NodoTree<T> root;
	private long length;
	//constructor
	public BinaryTree() {
		nodo = new NodoTree<>();
		root = null;
		length =0;
	}
	public void insert(T value) {
		NodoTree<T> nuevo = nodo.createNode();//create a new node
		nuevo.setData(value);//inserts a value into it
		if(root==null) {
			root = nuevo;
		}else {
			NodoTree<T> aux = root;
			NodoTree<T> parent;
			while(true) {
				parent = aux;
				if(value.compareTo(parent.getData())<0) {
					aux = aux.getLeft();
					if(aux==null) {
						parent.setLeft(nuevo);
						//root = parent;
						length ++;
						return;
					}
				}else if(value.compareTo(parent.getData())>0) {
					aux = aux.getRigth();
					if(aux==null) {
						parent.setRigth(nuevo);
						//root = parent;
						length ++;
						return;
					}
				}else {
					return;
				}
			}
		}

	}
	// getter and setter
	/**
	 * @return the root
	 */
	public NodoTree<T> getRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(NodoTree<T> root) {
		this.root = root;
	}
	/**
	 * @return the length
	 */
	public long size() {
		return length;
	}
	public void recursive(NodoTree<T> value) {
		if(value!=null) {
			NodoTree<T> aux = value.getRigth();
			value.setRigth(value.getLeft());
			value.setLeft(aux);
			System.out.println(value.getData());
			recursive(value.getLeft());
			recursive(value.getRigth());
			
		}else {
			return;
		}
	}
	
}
