public class Node {
	private int dato;
	private Node next;

	public Node(int dato, Node next) {
		this.dato = dato;
		this.next = next;
	}

	public int getdato() {
		return this.dato;
	}

	public void setdato(int dato) {
		this.dato = dato;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
