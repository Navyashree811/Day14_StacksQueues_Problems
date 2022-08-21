/*
 * UC 2 : Ability to peak and pop from the stack till it is empty 56 -> 30 -> 70.
 */
package com.bridgelabz.stackqueue;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedLists operationStack = new LinkedLists();
		operationStack.push(70);
		operationStack.push(30);
		operationStack.push(56);
		operationStack.display();
		System.out.println("Peak Element is = " + operationStack.peak());
		operationStack.pop();
		operationStack.display();

	}

}
