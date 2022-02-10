package linkedlist;

import java.util.Iterator;

import interfaces.List;
import nodo.NodoBidirectional;

public class LinkedList<T> implements Iterator<T>,Iterable<T>,List<T>{
	//propiedades
	private NodoBidirectional<T> nodo;
	private NodoBidirectional<T> heap;
	private NodoBidirectional<T> queue;
	private long length;
	
	public LinkedList() {//constructor por defecto
		this(new NodoBidirectional<>(),null,null,0);
	}
	
	/**
	 * @param nodo
	 * @param heap
	 * @param queue
	 * @param length
	 */
	public LinkedList(NodoBidirectional<T> nodo,
			NodoBidirectional<T> heap, NodoBidirectional<T> queue, long length) 
	{this.nodo = nodo;this.heap = heap;this.queue = queue;this.length = length;}
	/**
	 * inserta un nodo al final de la lsita ligada y retorna true si se inserto
	 * correctamente o false si ocurrio un error
	 * @author mayk
	 * @param value
	 * @return boolean
	 **/
	public boolean append(T value) {
		NodoBidirectional<T> nuevo = nodo.createNode();//crea un nuevo nodo
		if(nuevo==null)return false;//valida si no se creo el ndo
		nuevo.setData(value);//coloca el valor al nodo
		if(length==0) {//valida si la lista esta vacia y crea el primer ndoo
			
			heap = nuevo;
			queue = nuevo;
			
		}else {//su no  esta vacia enlista el nuevo nodo al final
			
			queue.setNext(nuevo); 
			nuevo.setPrev(queue);
			queue = nuevo;
			
		}
		length++;//incrementa la longitud de la liista
		return true;
	}
	/**
	 * inserta un nodo al inicio de la lista y retorna true si esta correcto o false
	 * si ocurrio un error
	 * @author mayk
	 * @param value
	 * @return boolean
	 **/
	public boolean add(T value) {
		NodoBidirectional<T> nuevo = nodo.createNode();//crea un nuevo nodo
		nuevo.setData(value);//coloca el valor
		if(length==0) {//valida si la lista esta vacia y crea un primer nodo
			heap = nuevo;
			queue = nuevo;
		}else {// si la lsita no esta vacia coloca el nodo al inicio
			heap.setPrev(nuevo);
			nuevo.setNext(heap);
			nuevo.setPrev(null);
			heap = nuevo;
		}
		length++;//incrementa la longitud de el nodo
		return true;
	}
	/**
	 * retorna el valor en el indice indicado, lanza IndexOutOfBoundsException si 
	 * el indice esta fuera del rango
	 * @author mayk
	 * @param index
	 * @return T
	 * @throws IndexOutOfBoundsException
	 **/
	public T get(int index) {
		NodoBidirectional<T> tmp = heap;// crea un nodo igual a toda la lista para recorrerla
		int count = 1;//contador
		if(index>length||index<1)throw new IndexOutOfBoundsException(index);//si el indice es mayor a la longitud de la lista
		while(tmp!=null) {//mientras aya un nodo avanza
			if(count==index) {// si el indice es igual al contador enconmtramos la posicion
				break;
			}
			tmp = tmp.getNext();//va al siguente nodo
			count++;//incrementa el contador
		}
		return tmp.getData();
	}
	/**
	 * inserta un nodo en el indice dado, lanza un IndexOutOfBoundsException si
	 * el indice es mayor a la longitud de la lista
	 * @author mayk
	 * @param index
	 * @param value
	 * @return boolean
	 * @throws IndexOutOfBoundsException
	 **/
	public boolean add(int index,T value) {
		
		NodoBidirectional<T> nuevo = nodo.createNode();//crea un nuevo nodo
		nuevo.setData(value);//inserta el valor
		
		if(length==0) {//valida si la lista esta vacia y crea un primer nodo
			heap = nuevo;
			queue = nuevo;
		}else {// si la lsita no esta vacia, inserta el ndoo en el indice dado
			
			NodoBidirectional<T> tmp = heap;// crea un nodo igual a toda la lista para recorrerla
			int count = 1;//contador
			if(index>length||index<1)throw new IndexOutOfBoundsException(index);//si el indice es mayor a la longitud de la lista
			while(tmp!=null) {//mientras aya un nodo avanza
				if(count==index) {// si el indice es igual al contador enconmtramos la posicion
					//configura nodo nuevo
					nuevo.setNext(tmp);
					nuevo.setPrev(tmp.getPrev());
					//conf others
					if(tmp.getPrev()==null) {//si es null el anterior de el primero
						
						tmp.setPrev(nuevo);
						heap = nuevo;
						
					}else {//si no es null
						
						//configuramos otros ndos
						tmp.getPrev().setNext(nuevo);
						tmp.setPrev(nuevo);
					}
					break;
				}
				tmp = tmp.getNext();//va al siguente nodo
				count++;//incrementa el contador
			}
			
		}
		length++;//incrementa la longitud de la lista
		return true;
	}
	/**
	 * remueve el elemento en el indice dado, lanza un IndexOutOfBoundsException si
	 * el indice esta fuera de rango
	 * @author mayk
	 * @param index
	 * @return data
	 * @throws IndexOutOfBoundsException
	 **/
	public T remove(int index) {//remueve elementos en el indice
		NodoBidirectional<T> tmp = heap;// crea un nodo igual a toda la lista para recorrerla
		T data = null;
		int count = 1;//contador
		if(index>length||index<1)throw new IndexOutOfBoundsException(index);//si el indice es mayor a la longitud de la lista
		while(tmp!=null) {//mientras aya un nodo avanza
			if(count==index) {// si el indice es igual al contador enconmtramos la posicion
				data = tmp.getData();//salva el valor a eliminar
				if(tmp.getPrev()==null) {//si el anterior del ultimo es null
					tmp.getNext().setPrev(null);//el siguiente del ultimo apunta nul hacia atras
					heap = tmp.getNext();//la cabeza ahora sera el siguiente del ultimo
				}else {//si no es null
		
					tmp.getPrev().setNext(tmp.getNext());//el anterior del encontrado apunta al siguiente del encontrado en next
					tmp.getNext().setPrev(tmp.getPrev());//el siguiente del encontrado apunta al anterior del encontrado en prev
				}
				break;
			}
			tmp = tmp.getNext();//va al siguente nodo
			count++;//incrementa el contador
		}
		return data;
	}
	/**
	 * @return the length
	 */
	public long size() {//longitud de la lista
		return length;
	}

	@Override
	public String toString() {
		return "LinkedList [heap=" + heap + ", length=" + length + "]";
	}
	@Override
	public boolean hasNext() {
		if(heap!=null)return true;
		else return false;
	}
	@Override
	public T next() {
		T data = heap.getData();
		heap =heap.getNext();
		
		return data;
	}
	public T prev() {
		heap =heap.getPrev();
		T data = heap.getData();
		
		return data;
	}
	@Override
	public Iterator<T> iterator() {
		LinkedList<T> link = new LinkedList<T>();
		link.heap = this.heap;
		link.length = this.length;
		link.queue = this.queue;

		return link;
	}
	

}
