package stack;

import java.util.Iterator;

import nodo.Nodo;

public class Stack<T> implements Iterator<T>,Iterable<T>{
	//-----------------------------
	private Nodo<T> nodo;
	private Nodo<T> top;
	private long length;
	
	public Stack() {
		nodo = new Nodo<>();
		top = null;
		length = 0;
	}
	//-----------------------------
	/**
	 * inserta un nodo a la pila
	 * @author mayk
	 * @param value
	 * @return true o false
	 **/
	public boolean push( T value ) {

		Nodo<T> nuevo = nodo.createNode();//crea un nuevo nodo
		if(nuevo==null)return false;//si esta vacio devuelve falso
		
		nuevo.setData( value );//le coloca el valor al nuevo nodo
		nuevo.setNext(top);//coloca lo que hay dentro del nodo
		top = nuevo;//el nuevo nodo ahora sera la cabeza
		length++;//incrementa la longitud
		return true;
	}
	//-----------------------------
	/**
	 * elimina el primer nodo de la pila 
	 * @author mayk
	 * @return the value
	 **/
	public T pop() {
			T value = top.getData();//guarda el valor del nodo
			top = top.getNext();//la cabeza es igual siguiente de la cabeza
			length--;//decrementa la longitud
			return value;
	}
	/**
	 * @return the length
	 */
	public long size() {
		return length;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		Stack<T> pila = new Stack<>();
		pila.length = this.length;
		pila.top = this.top;
		return pila;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(top!=null)return true;
		else return false;
	}
	@Override
	public T next() {
		// TODO Auto-generated method stub
		T data = top.getData();
		top = top.getNext();
		return data;
	}
}
