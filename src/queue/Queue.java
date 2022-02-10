package queue;

import java.util.Iterator;

import nodo.Nodo;

public class Queue<T> implements Iterator<T>,Iterable<T>{
	private Nodo<T>nodo;
	private Nodo<T> first;
	private Nodo<T> last;
	private long length;
	
	public Queue () {
		nodo = new Nodo<>();
		first = null;
		last = null;
		length = 0;
	}
	/**
	 * inserta un nodo al final de la cola
	 * @author mayk
	 * @param value
	 * @return true or false
	 **/
	public boolean push( T value ) {
		Nodo<T>tmp = nodo.createNode();//crea un nuevo nodo
		if( tmp == null )return false;//si hay error retorna false
		
		tmp.setData( value );//le asigna los datos al nuevo nodo
		
		if( length==0 ) {//si esta vacia la lista
			
			first = tmp;//el nodo es la cabeza
			last = tmp;//el nodo es la cola
			
		}else {//si no esta vacia
			
			last.setNext(tmp);//la cola apunta al nuevo
			last = tmp;//el nuevo ahora es la cola
				
		}
		length++;//incrementa la longitud
		return true;
	}
	
	/**
	 * elimina el primer nodo de la cola y retorna su valor
	 * @author mayk
	 * @return value
	 **/
	public T pop() {
		T value = first.getData();//guarda el valor del nodo a eliminar
		first = first.getNext();//el primer nodo sera el segundo
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
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(first!=null)return true;
		else return false;
	}
	@Override
	public T next() {
		// TODO Auto-generated method stub
		T data = first.getData();
		first = first.getNext();
		return data;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		Queue<T> cola = new Queue<>();
		cola.first = this.first;
		cola.last = this.last;
		cola.length = this.length;
		return cola;
	}
	
}
