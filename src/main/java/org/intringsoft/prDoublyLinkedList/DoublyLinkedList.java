package org.intringsoft.prDoublyLinkedList;

public class DoublyLinkedList<T> {

  private static class Node<T> {
    private T data;
    private Node<T> prev;
    private Node<T> next;

    public Node() {
      data = null;
      prev = null;
      next = null;
    }

    public Node(T data, Node<T> prev, Node<T> next) {
      this.data = data;
      this.prev = prev;
      this.next = next;
    }
  }

  private Node<T> first;
  private Node<T> last;

  public DoublyLinkedList() {
    first = null;
    last = null;
  }

  public boolean isEmpty() {
    return first == null && last == null;
  }

  public void insertBefore(Node<T> node, Node<T> newNode) {
    newNode.prev = node.prev;
    newNode.next = node;
    if (node.prev == null) {
      first = newNode;
    } else {
      node.prev.next = newNode;
      node.prev = newNode;
    }
  }

  public void insertAfter(Node<T> node, Node<T> newNode) {
    newNode.prev = node;
    newNode.next = node.next;
    if (node.next == null) {
      last = newNode;
    } else {
      node.next.prev = newNode;
      node.next = newNode;
    }
  }

  public void insertBeginning(Node<T> newNode) {
    if (isEmpty()) {
      first = newNode;
      last = newNode;
      newNode.prev = null;
      newNode.next = null;
    } else {
      insertBefore(first, newNode);
    }
  }

  public void insertEnd(Node<T> newNode) {
    if (last == null) {
      insertBeginning(newNode);
    } else {
      insertAfter(last, newNode);
    }
  }

  public void remove(Node<T> node) {
    if (node.prev == null) {
      first = node.next;
    } else {
      node.prev.next = node.next;
    }
    if (node.next == null) {
      last = node.prev;
    } else {
      node.next.prev = node.prev;
    }
  }
}
