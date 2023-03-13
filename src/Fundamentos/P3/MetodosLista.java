package Fundamentos.P3;


public class MetodosLista<E> extends NodoLista<E> {
	//instanciar objetos y metodos de la clase simplelinkdlist

			//head o cabeza del nodo de la lista
			private Node<E> head = null;
			private Node<E> tail = null;

			//numero de nodos de la lista
			private int size = 0; //EDD Dinamica!!

			//constructor
			public MetodosLista() {

			}


			//metodos para la lista enlazada
			//tama�o

			public int size() {
				return size();
			}
			//si esta vacia
			public boolean isEmpty() {
				return size == 0;
			}
			//retornar el primer elemento
			public E first() {
				if(isEmpty()) return null;
				return head.getElement();


			}

			//retornar el ultimo elemento
			public E last() {
				if(isEmpty()) return null;
				return tail.getElement();


			}

			//agregar datos al inicio de la lista
			public void addFirst(E e) {
				head = new Node<>(e,head); //e = elemento y head = referencia
				if(size == 0)
					tail = head;
				size++;

			}
			// agregar datos al fin de la lista
			public void addLast(E e) {
				Node<E> newest = new Node<>(e,null);
				if(isEmpty())
					head = newest;
				else
				tail.setNext(newest);
				tail = newest;
				size++;
			}
			//remover al inicio
			public E removeFirst() {
				if(isEmpty()) return null;
				//n1--n2--n3
				E e1 = head.getElement(); //obtengo el valor del primer elemeto n1
				head = head.getNext(); //apunto o referencio al siguiente n2
				size --;
				if(size == 0)
					tail = null;
				return  e1;
			}

			public Node<E> removeLast() {
			    if(isEmpty())
			        return null;
			    Node<E> temp =head;
			    Node<E> temp2 =head.getNext();
			    while(temp!=null && temp2!=null) {
			        if(temp2.getNext()==null) {
			            tail=temp;
			            temp.setNext(null);
			        }
			        temp2=temp2.getNext();
			        temp=temp.getNext();
			    }
			    if(head.getNext()==null)
			        tail=head;
			    return tail;
			}

			//obtener
			public E  getElementObject (int index) {
				int c = 0;
				//n1--n2--n3
				Node<E> tmp = head; //me ubico en la cabeza = n1
				while(c < index ) {
					tmp = tmp.getNext();//recorre cada elemento de la lista
					c++;
				}
				return tmp.getElement();
			}

			//mostrar todos
			public void getAll() {
				Node <E> tmp = head; //me ubico en la cabeza de la lista
				//recorrer
				while(tmp != null) {
					System.out.println(tmp.getElement().toString());
					tmp = tmp.getNext();
				}
			}

			//mostrar todas las personas
			public void getAllPersonas() {
				@SuppressWarnings("unchecked")
				Node <Persona> tmp = (Node<Persona>) head; //me ubico en la cabeza de la lista
				//recorrer
				while(tmp != null) {
					System.out.println(tmp.getElement().mostrar());
					tmp = tmp.getNext();
				}
			}
}
