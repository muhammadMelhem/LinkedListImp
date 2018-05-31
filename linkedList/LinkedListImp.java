package linkedList;

public class LinkedListImp<E> implements LinkedList<E> {

	private Node<E> head, tail;
	private int size = 0;

	public LinkedListImp() {

	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");

		Node<E> current = head;

		for (int i = 0; i < size; i++) {
			result.append(current.data);
			current = current.next;
			if (current != null) {
				result.append(", ");
			} else {
				result.append("]");
			}
		}
		return result.toString();
	}

	@Override
	public E getFirst() {

		if (size == 0)
			return null;
		else
			return head.data;

	}

	@Override
	public E getLast() {
		if (size == 0)
			return null;
		else
			return tail.data;
	}

	@Override
	public E get(int index) {

		Node<E> current = head;

		if (size == 0)
			return null;
		else if (index < size) {
			for (int x = 0; x <= index; x++) {
				if (x == index)
					return current.data;
				current = current.next;

			}

		}

		return null;
	}

	@Override
	public void addFirst(E e) {
		Node<E> newNode = new Node<>(e);

		newNode.next = head;
		head = newNode;

		size++;

		if (tail == null)
			tail = head;

	}

	@Override
	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);

		if (tail == null)
			head = tail = newNode;
		else {
			tail.next = newNode;
			tail = tail.next;
		}
		size++;
	}

	@Override
	public void add(int index, E e) {

		if (index == 0)
			addFirst(e);
		else if (index >= size) {
			addLast(e);
		}

	}

	@Override
	public void add(E e) {

		if (size == 0)
			addFirst(e);
		else if (size > 0) {
			addLast(e);
		}

	}

	@Override
	public E removeFirst() {
		if (size == 0)
			return null;
		else {

			Node<E> temp = head;
			head = head.next;

			size--;

			if (head == null)
				tail = null;

			return temp.data;
		}
	}

	@Override
	public E removeLast() {
		if (size == 0)
			return null;
		else if (size == 1) {

			Node<E> temp = head;

			size = 0;
			head = tail = null;

			return temp.data;
		} else {
			Node<E> current = head;

			for (int i = 0; i < size - 2; i++)
				current = current.next;

			Node<E> temp = tail;
			tail = current;
			tail.next = null;

			size--;

			return temp.data;
		}
	}

	@Override
	public E remove(int index) {
		if (index < 0 || index >= size)
			return null;
		else if (index == 0)
			return removeFirst();
		else if (index == size - 1)
			return removeLast();
		else {
			Node<E> previous = head;

			for (int i = 1; i < index; i++)
				previous = previous.next;

			Node<E> current = previous.next;
			previous.next = current.next;

			size--;

			return current.data;

		}

	}

	@Override
	public void clear() {

		size = 0;
		head = tail = null;
	}

	@Override
	public boolean contains(E e) {
		Node<E> temp = new Node<>(e);
		Node<E> current = head;

		if (size == 0)
			return false;
		else {
			for (int x = 0; x <= size - 1; x++) {

				if (current.data == temp.data) {
					return true;
				}
				current = current.next;
			}
		}
		return false;

	}

	@Override
	public int indexOf(E e) {
		Node<E> temp = new Node<>(e);
		Node<E> current = head;

		if (size == 0)
			return 0;
		else {
			for (int x = 0; x <= size - 1; x++) {

				if (current.data == temp.data) {
					return x;

				}
				current = current.next;

			}

		}
		return 0;
	}

	@Override
	public int lastIndexOf(E e) {
		Node<E> temp = new Node<>(e);
		Node<E> current = head;
		int lastIndex = 0;

		if (size == 0)
			return 0;
		else {
			for (int x = 0; x <= size - 1; x++) {

				if (current.data == temp.data) {
					lastIndex = x;
				}
				current = current.next;
			}
		}
		return lastIndex;
	}

	@Override
	public void replace(int index, E e) {

		Node<E> newNode = new Node<>(e);
		Node<E> after;
		Node<E> current = head;
		if (index == 0) {
			current = head.next;
			head = newNode;
			newNode.next = current;

		} else {
			for (int x = 0; x <= index - 2; x++)
				if (index > 0)
					current = current.next;

			after = (current.next).next;

			current.next = (current.next).next;
			current.next = newNode;
			newNode.next = after;

		}
	}

}
