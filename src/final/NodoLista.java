package examenFinal;

// CLASE PADRE
public class NodoLista<E> {

	// CLASE INTERNA O CLASE HIJO DENTRO DE LA CLASE PADRE
	public static class Node<E> {
		private E element; // elemento que se gurada en el nodo
		private Node<E> next; // referencia al siguiente nodo
		// constructor

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		// getters and setters o encapsulacion
		public E getElement() {
			return element;
		}

		public void setNext(Node<E> n) {
			next = n;
		}

		public Node<E> getNext() {
			return next;
		}
	}

} // FIN CLASE PADRE
