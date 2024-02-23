public class Cola {
	private Node ultimo;
	private Node primero;

	public Cola() {
		this.ultimo = null;
		this.primero = null;
	}

	public boolean isColaEmpty(boolean showWarning) {
		if (ultimo == null) {
			if (showWarning)
				System.out.println("\nLa lista se encuentra vacía.");
			return true;
		}
		return false;
	}

	public void push(int dato) {
		Node node = new Node(dato, null);
		if (isColaEmpty(false)) {
			ultimo = node;
			primero = node;
		} else {
			node.setNext(ultimo);
			ultimo = node;
		}
		System.out.println("Se ha insertado con éxito.");
	}

	public void pop() {
		Node aux = ultimo;
		if (!isColaEmpty(true)) {
			if (getAmountNodes() >= 2) {
				aux = ultimo;
				while (aux.getNext() != primero)
					aux = aux.getNext();
				aux.setNext(null);
				primero = aux;
			} else {
				ultimo = null;
				primero = null;
			}
			System.out.println("Se ha eliminado con éxito.");
		}
	}

	public int getAmountNodes() {
		Node aux;
		int counter = 0;
		if (!isColaEmpty(false)) {
			aux = ultimo;
			while (aux != null) {
				++counter;
				aux = aux.getNext();
			}
		}
		return counter;
	}

	public void showData() {
		Node aux = ultimo;
		int counter = 0;
		if (!isColaEmpty(true))
			while (aux != null) {
				counter++;
				System.out.printf("\n%d° elemento de la lista...", counter);
				System.out.println("\n\tDato: " + aux.getdato());
				aux = aux.getNext();
			}
	}

}
