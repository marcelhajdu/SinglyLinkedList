package com.algorithms;

public class LinkedList {
  private Node head;
  private int size;

  public int getSize() {
    return this.size;
  }

  public void addToStart(int data) {
    Node addedNode = new Node(data);
    if(head == null) {
      this.head = addedNode;
    } else {
      addedNode.setNext(head);
      this.head = addedNode;
    }
    this.size++;
  }

  public Node deleteFromStart() {
    if(this.size == 0) {
      return null;
    } else if (this.size == 1) {
      head = null;
      this.size--;
      return null;
    } else {
      Node deletedNode = head;
      head = head.getNext();
      this.size--;
      return deletedNode;
    }
  }

  public void addToTail(int data) {
    Node node = new Node(data);
    if(head == null) {
      this.head = node;
    } else {
      Node current = head;
      while(current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(node);
    }
    this.size++;
  }

  public void removeFromTail() {
    Node current = this.head;
    int i = 0;
    while (i < this.size - 2) {
      current = current.getNext();
      i++;
    }
    current.setNext(null);
    this.size--;
  }

  public Node getNode(int index) {
    if(index < 0 || index >= this.size) {
      return null;
    } else {
      Node current = this.head;
      int i = 0;
      while (i != index) {
        current = current.getNext();
        i++;
      }
      return current;
    }
  }

  public void setNode(int data, int position) {
    if(position < 0 || position >= this.size) {
      return;
    } else {
      Node upgradedNode = getNode(position);
      upgradedNode.setData(data);
    }
  }

  

  public void printLL() {
    Node current = head;
    while (current != null) {
      System.out.print(current.getData() + " ");
      current = current.getNext();
    }
    System.out.println();
  }
}
