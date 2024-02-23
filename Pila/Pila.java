public class Pila {
	private Node start;

	public Pila() {
		this.start = null;
	}

	public boolean isPilaEmpty(boolean showWarning) {
		if (start == null) {
			if (showWarning)
				System.out.println("\nLa lista esta vacía.");
			return true;
		}
		return false;
	}

	public void push(int data) {
		Node node = new Node(data, null);
		if (isPilaEmpty(false))
			start = node;
		else {
			node.setNext(start);
			start = node;
		}
		System.out.println("Se ha insertado con éxito.");
	}

	public void pop() {
		if (!isPilaEmpty(true)) {
			start = start.getNext();
			System.out.println("Se ha eliminado con éxito.");
		}
	}

	public void showData() {
		Node aux = start;
		int counter = 0;
		if (!isPilaEmpty(true))
			while (aux != null) {
				counter++;
				System.out.printf("\n%d° elemento de la lista...", counter);
				System.out.println("\n\tDato: " + aux.getdata());
				aux = aux.getNext();
			}
	}

}
