package com.algorithms;

public class Main {

    public static void main(String[] args) {
      LinkedList linkedList = new LinkedList();
      linkedList.addToStart(15);
      linkedList.addToStart(16);
      linkedList.addToStart(17);
      linkedList.addToStart(18);
      linkedList.addToTail(14);
      linkedList.addToTail(13);
      linkedList.addToTail(12);
      linkedList.addToTail(11);
      System.out.println(linkedList.getSize());
      linkedList.printLL();


    }
}
