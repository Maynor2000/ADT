package nodo;

public class NodoBidirectional<T> {
	private NodoBidirectional<T> next;
	private NodoBidirectional<T> prev;
	private T data;
	
	public NodoBidirectional() {
		next = null;
		prev = null;
		data = null;
	}
	/**
	 * @return the prev
	 */
	public NodoBidirectional<T> getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(NodoBidirectional<T> prev) {
		this.prev = prev;
	}
	public NodoBidirectional<T> createNode(){
		NodoBidirectional<T> tmp = new NodoBidirectional<>();
		return tmp;
	}
	/**
	 * @return the next
	 */
	public NodoBidirectional<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(NodoBidirectional<T> next) {
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
