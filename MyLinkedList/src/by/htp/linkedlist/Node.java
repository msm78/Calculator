package by.htp.linkedlist;

public class Node {
	private int el;
	private Node prev;
	private Node next;
	
	public Node(int el, Node prev, Node next) {
		super();
		this.el = el;
		this.prev = prev;
		this.next = next;
	}
	public int getEl() {
		return el;
	}
	public void setEl(int el) {
		this.el = el;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		if (prev!=null)
			return prev + ", " + el;
		else
			return ""+el;
	}
	
	
	

}
