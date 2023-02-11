package ui;
package model.*;

public class Main{

	public static void main(String[] args) {
		
		LinkedList listL = new LinkedList(); 

		listL.addLast(new Node(0));
		listL.addLast(new Node(1));
		listL.addLast(new Node(2));
		listL.addLast(new Node(3));
		listL.addLast(new Node(4));
		listL.addLast(new Node(5));
		listL.addLast(new Node(6));

		System.out.println(listL.printList());  

		System.out.println(listL.search(0)); // imprime la cabeza de la lista
		System.out.println(listL.search(6)); // imprime la cola de la lista
		System.out.println(listL.search(3)); // imprime el caso intermedio

		// elimina la cabeza 
		System.out.println("Elimino la cabeza");
		listL.delete(0);
		System.out.println(listL.printList());

		// elimina la cola
		System.out.println("Elimino la cola");
		listL.delete(6);
		System.out.println(listL.printList());

		// caso intermedio 
		System.out.println("Elimino un nodo intermedio");
		listL.delete(3);
		System.out.println(listL.printList());

	}
}