package by.htp.linkedlist;

public class Main {

	public static void main(String[] args) {

		MyLinkedList mll = new MyLinkedList();
		System.out.println("mll: "+mll);
		mll.add(4);
		System.out.println("mll: "+mll);
		mll.insert(9, 1);
		System.out.println("mll: "+mll);
		
		System.out.println("\n---------------");
		MyLinkedList mll2 = new MyLinkedList(3);
		System.out.println("mll2: "+mll2);
		System.out.println("add 4 5 6");
		mll2.add(4);
		mll2.add(5);
		mll2.add(6);
		System.out.println("mll2: "+mll2);
		System.out.println("mll2.get(1): "+mll2.get(1));
		mll2.set(7, 1);
		System.out.println("mll2.set(7, 1): "+mll2);
		mll2.insert(9, 4);
		System.out.println("mll2.insert(9, 4): "+mll2);
		mll2.del(4);
		System.out.println("mll2.del(4): "+mll2);
		

	}

}
