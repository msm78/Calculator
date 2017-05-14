package by.htp.linkedlist;

public class MyLinkedList {
	private Node lastEl;
	private int length;
	
	public MyLinkedList() {
	}
	
	public MyLinkedList(int el) {
		lastEl = new Node(el, null, null);
		length++;
	}
	
	public void add(int el) {
		Node addEl = new Node(el, lastEl, null);
		if (lastEl!=null) {
			lastEl.setNext(addEl); 
		}
		lastEl = addEl;
		length++;
	}
	
	public Node get(int num) {
		Node rez = null;
		if ((num>0)&&(num<=length)) {
			rez = lastEl;
			for (int i=length-1; i>=num; i--) {
				rez = rez.getPrev();
			}
		}
		return rez;
	}
	
	public void set(int el, int num) {
		Node curent = lastEl; 
		if ((num>0)&&(num<=length)) {
			for (int i=length-1; i>=num; i--) {
				curent = curent.getPrev();
			}
		}
		curent.setEl(el);
 	}
	
	public void del(int num) {
		Node curent = get(num); 
		if (curent!=null) {
			Node prev = curent.getPrev(); 
			Node next = curent.getNext();
			if (prev!=null) {
				prev.setNext(next);
			}
			if (next!=null) {
				next.setPrev(prev);
			} else {
				lastEl = prev;
			}
			length--;
		}

 	}
 	
	public void insert(int el, int num) {
		Node curent = lastEl; 
		if ((num>0)&&(num<=length)) {
			for (int i=length-1; i>=num; i--) {
				curent = curent.getPrev();
			}
			Node insEl = new Node(el, curent.getPrev(), curent);
			curent.setPrev(insEl);
			length++;
		}
 	}

	@Override
	public String toString() {
		return "MyLinkedList ["+lastEl+ "], length=" + length;
	}

	
	
	
	

}
