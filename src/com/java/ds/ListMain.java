package com.java.ds;
/**
 * Program to show different types of lists
 * @author 532080
 *
 */
public class ListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList list = new LinkList();

		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		Node start = list.getHead();
		System.out.println("Content of list: ");
		for (int i = 1; i <= list.size(); i++) {
			System.out.println(start.getNum());
			start = start.getNxt();
		}
		list.delete(4);
		start = list.getHead();
		System.out.println("Content of list after deletion of value 4: ");
		for (int i = 1; i <= list.size(); i++) {
			System.out.println(start.getNum());
			start = start.getNxt();
		}
		list.add(5);
		start = list.getHead();
		System.out.println("Content of list after addition of value 5: ");
		for (int i = 1; i <= list.size(); i++) {
			System.out.println(start.getNum());
			start = start.getNxt();
		}

		LinkList stack = new LinkList();
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(3);
		start = stack.getHead();
		System.out.println("Content of stack after pushing elements: ");
		for (int i = 1; i <= stack.size(); i++) {
			System.out.println(start.getNum());
			start = start.getNxt();
		}
		stack.pop();
		start = stack.getHead();
		System.out.println("Content of stack after deletion of element - LIFO: ");
		for (int i = 1; i <= stack.size(); i++) {
			System.out.println(start.getNum());
			start = start.getNxt();
		}
		LinkList queue = new LinkList();
		queue.add(11);
		queue.add(67);
		queue.add(98);
		queue.add(34);
		start = queue.getHead();
		System.out.println("Content of queue after adding elements: ");
		for (int i = 1; i <= queue.size(); i++) {
			System.out.println(start.getNum());
			start = start.getNxt();
		}
		queue.deque();
		start = queue.getHead();
		System.out.println("Content of queue after deletion of element FIFO: ");
		for (int i = 1; i <= queue.size(); i++) {
			System.out.println(start.getNum());
			start = start.getNxt();
		}

	}

}
