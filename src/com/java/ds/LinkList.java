package com.java.ds;

public class LinkList {
	private Node head;
	private Node tail;
	private int length;

	public LinkList() {

	}

	public void add(int val) {

		if (head == null) {
			head = new Node();
			head.setNum(val);
		} else {
			Node temp = new Node();
			temp.setNum(val);
			Node current = head;
			while (current.getNxt() != null) {
				current = current.getNxt();
			}
			current.setNxt(temp);
		}
		length++;
	}

	public void delete(int val) {
		Node current = head;
		Node temp = null;
		if (current.getNxt() == null) {
			current.setNum(0); // if only 1 element present in the queue
		}
		while (current.getNxt() != null) {
			if (current.getNxt().getNum() == val) {
				temp = current.getNxt().getNxt(); // node after the one which is
													// to be deleted
				current.setNxt(temp); // reference of current node
				current.getNxt().setNxt(null);
				length--;
			} else {
				current = current.getNxt();
			}

		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void push(int val) {
		if (head == null && tail == null) {
			head = new Node();
			head.setNum(val);
			tail = head;
		} else {
			Node temp = new Node();
			temp.setNum(val);
			Node current = head;
			while (current.getNxt() != null) {
				current = current.getNxt();
			}
			current.setNxt(temp);
			tail = temp;
		}
		length++;
	}

	public void pop() {
		Node current = head;
		if (current.getNxt() == null) {
			current.setNum(0); // if only 1 element present in the queue
		}
		while (current.getNxt() != null) {
			if (current.getNxt().getNxt() == null) {
				current.setNxt(null); // Delete the most recently inserted
										// element

				tail = current;
				length--;
			} else {
				current = current.getNxt();
			}

		}
	}

	public void deque() {
		Node current = head;
		if (current.getNxt() == null) {
			current.setNum(0); // if only 1 element present in the queue
		}
		while (current.getNxt() != null) {
			head = current.getNxt();
			current.setNxt(null); // Delete the head element

			length--;

		}
	}

	public int size() {
		return length;
	}
}
