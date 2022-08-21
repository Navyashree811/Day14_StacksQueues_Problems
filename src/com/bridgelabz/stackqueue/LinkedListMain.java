/*
 * UC 4 : Ability to dequeue from the beginning.
 */
package com.bridgelabz.stackqueue;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedLists oparetionQueue = new LinkedLists();
		oparetionQueue.append(56);
		oparetionQueue.append(30);
		oparetionQueue.append(70);

		oparetionQueue.display();
		oparetionQueue.dequeue();
	}

}
