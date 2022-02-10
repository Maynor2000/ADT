package nodo;

public class NodoTree<T extends Comparable<T>> {
	//propertis
	private NodoTree<T> left;
	private NodoTree<T> rigth;
	private T data;
	/**
	 * constructor
	 */
	public NodoTree() {
		left = null;
		rigth = null;
		data = null;
	}
	/**
	 * create a new node and it is returned
	 * @author mayk
	 * @return the new node
	 **/
	public NodoTree<T> createNode(){
		NodoTree<T> nuevo = new NodoTree<>();
		return nuevo;
	}
	/**
	 * @return the left
	 */
	public NodoTree<T> getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(NodoTree<T> left) {
		this.left = left;
	}
	/**
	 * @return the rigth
	 */
	public NodoTree<T> getRigth() {
		return rigth;
	}
	/**
	 * @param rigth the rigth to set
	 */
	public void setRigth(NodoTree<T> rigth) {
		this.rigth = rigth;
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
	@Override
	public String toString() {
		T left1 = left!=null?left.getData():(T)"null";
		T rigth1 = rigth!=null?rigth.getData():(T)"null";
		return "Nodo[left=" + left1 + ", rigth=" + rigth1 + ", data=" + data + "]";
	}

}
