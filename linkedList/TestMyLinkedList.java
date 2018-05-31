package linkedList;

public class TestMyLinkedList {

	public static void main(String[] args) {

		LinkedListImp<String> list = new LinkedListImp<>();

		list.add("Node 0");
		System.out.println("(1) " + list);

		list.add(0, "Node 1");
		System.out.println("(2) " + list);

		list.add("Node 2");
		System.out.println("(3) " + list);

		list.addLast("Node 3");
		System.out.println("(4) " + list);

		list.add(2, "Node 4");
		System.out.println("(5) " + list);

		list.add(5, "Node 5");
		System.out.println("(6) " + list);

		list.add(0, "Node 6");
		System.out.println("(7) " + list);

		list.remove(0);
		System.out.println("(8) " + list);

		list.addLast("Node 3");
		System.out.println("(4) " + list);

		list.remove(2);
		System.out.println("(9) " + list);

		System.out.print((list.contains("Node 3")) ? "yes" : "No");
		System.out.println((" In Index :" + list.indexOf("Node 3")));

		System.out.println((list.contains("Node 2000")) ? "yes" : "No");

		System.out.println(list.get(2));

		System.out.println(list.lastIndexOf("Node 3"));

		list.replace(0, "Replaced Node");
		System.out.println("after replaced index 0 :" + list);

	}

}
