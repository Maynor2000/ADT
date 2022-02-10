package nodo;

public class Nodo<T> {
	
	private Nodo<T> next;
	private T data;
	
	public Nodo() {
		next = null;
		data = null;
	}
	public Nodo<T> createNode(){
		Nodo<T> tmp = new Nodo<>();
		return tmp;
	}
	/**
	 * @return the next
	 */
	public Nodo<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Nodo<T> next) {
		this.next = next;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
}
