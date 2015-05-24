package org.intringsoft.prDoublyLinkedList;

public class DoublyLinkedList<T> {

	private static class Node<E> {
		private E data;
		private Node<E> next;
		private Node<E> prev;

		public Node(E d, Node<E> nxt, Node<E> prv) {
			data = d;
			next = nxt;
			prev = prv;
		}
	}

	private Node<T> first, last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null && last == null;
	}

	public void insertBefore(Node<T> node, Node<T> aux) {
		aux.prev = node.prev;
		aux.next = node;
		if (node.prev == null) {
			first = aux;
		} else {
			node.prev.next = aux;
			node.prev = aux;
		}
	}

	public void insertAfter(Node<T> node, Node<T> aux) {
		aux.prev = node;
		aux.next = node.next;
		if (node.next == null) {
			last = aux;
		} else {
			node.next.prev = aux;
			node.next = aux;
		}
	}

	public void insertBeginning(T d) {
		Node<T> aux = new Node<T>(d, null, null);
		if (isEmpty()) {
			first = aux;
			last = aux;
		} else {
			insertBefore(first, aux);
		}
	}

	public void insertEnd(T d) {
		Node<T> aux = new Node<T>(d, null, null);
		if (isEmpty()) {
			first = aux;
			last = aux;
		} else {
			insertAfter(last, aux);
		}
	}

	public T first() throws DoublyLinkedListException {
		if (isEmpty()) {
			throw new DoublyLinkedListException(
					"first on empty doubly linked list");
		} else {
			return first.data;
		}
	}

	public T last() throws DoublyLinkedListException {
		if (isEmpty()) {
			throw new DoublyLinkedListException(
					"last on empty doubly linked list");
		} else {
			return last.data;
		}
	}

	public void deleteFirst() throws DoublyLinkedListException {
		if (isEmpty()) {
			throw new DoublyLinkedListException(
					"delete first on empty doubly linked list");
		} else {
			first = first.next;
			if (first == null) {
				last = null;
			}
		}
	}

	public void deleteLast() throws DoublyLinkedListException {
		if (isEmpty()) {
			throw new DoublyLinkedListException(
					"delete last on empty doubly linked list");
		} else {
			last = last.prev;
			if (last == null) {
				first = null;
			}
		}
	}

	@Override
	public String toString() {
		String className = getClass().getName().substring(
				getClass().getPackage().getName().length() + 1);
		String s = className + "(";
		for (Node<T> node = first; node != null; node = node.next)
			s += node.data + (node.next != null ? "," : "");
		s += ")";
		return s;
	}
}
