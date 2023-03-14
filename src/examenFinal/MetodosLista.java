package examenFinal;



public class MetodosLista<E> {
	//clase interno dentor de la clase principal
		//nodo
	   public static class Node <E> {
		   private E element; //elemento que se guarda en el nodo
		   private Node <E> next;//referencia el siguiente node de la lista
		   
		  
		   //constructor
		   
		   public Node (E e, Node <E> n) {
			   element =e;
			   next = n;
			  
		   }
		   //getter and setters
		   
		public E getElement() {
			return element; //obtenemos el elemento  del nodo
		}


		public Node<E> getNext() {
			return next; //obtenemos la referencia
		}

		public void setNext(Node<E> n) {
		     next = n; // agregamos referencia
		}//fin clase interna
		
		   
	   }
	  
	   
	   public MetodosLista() {
		   
	   }
	 //instancias y general los metodos de la lista
	 	//1. Head nodo de la lista
	 	 private Node <E>  head= null;
	 	   private Node <E> tail = null;
	 	   
	 	 //2. numero de nodos de la lista
	 	   public int size=0;
	 	   //3. constructor
	 	  
	 	   //4. metodo
	 	   public int size() {
	 		   return size;
	 	   }
	 	   //si esta vacia
	 	   public boolean isEmpty() {
	 		   return size==0;
	 	   }
	 	   //return el primer valor
	 	   public E first() {
	 		   if(isEmpty()) return null;
	 		   return head.getElement();
	 	   }
	 	   //retornar el ultimo valor
	 	   public E last() {
	 		   if (isEmpty()) return null;
	 		   return tail.getElement();
	 	   }
	 	   //agregar inicio
	 	   public void addFirst (E e) {
	 		   head = new Node<E>(e,head); //e elemento y head la cabeza del nodo o referencia
	 		   if(size==0)
	 			   tail=head;
	 		   size++;
	 		   //head ---> head ---->head--->
	 	   }
	 	   //agregar el final de la lista
	 	   public void addLast(E e) {
	 		   Node<E> newest = new Node(e,null);
	 		   if(size==0)
	 			   head=newest;
	 		   else
	 			 tail.setNext(newest);
	 		   tail = newest;
	 		   size++;
	 		   
	 	   }
	 
	 	  	
	 	 public void removeFrist() {
	 		 Node<E> tmp = head;
	 		 head= head.next;
	 		 tmp.next= null;
	 		 if(head == null) {
	 			 System.out.println("Primer  no ha sido Eliminado");
	 		 }
	 		 
	 		 System.out.println("Primer dato eliminado con exito");
	 		}
	 	public void removeLast() {
	 		 Node<E> last= head;
	 		 Node<E> previousToLast = null;
	 		 while(last.next != null) {
	 			 previousToLast = last;
	 			 last= last.next;
	 		 }
	 		previousToLast.next = null;
	 		System.out.println("Ultimo dato eliminado con exito"); 
	 		}
	 	  
	 	   public E getElement(int index) {
	 		   int c =0;
	 		   Node<E> tmp=head;
	 		  while(c<=index){
	 			  tmp=tmp.getNext();
	 			  c++;
	 		  }
	 		  return tmp.getElement();
	 	   }
	 	
	 	  public void getAllPersonas() {
			   int c =0;
			   Node<E> tmp=head;
			  while(tmp!=null){
				  System.out.println(tmp.getElement());
				  tmp=tmp.getNext();
			  }
			  
		   }
}
