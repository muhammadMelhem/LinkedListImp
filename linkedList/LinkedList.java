package linkedList;

public interface LinkedList<E> {
	public E getFirst();

	public E getLast();

	public E get(int index);

	public void addFirst(E e);

	public void addLast(E e);

	public void add(int index, E e);

	public void add(E e);

	public E removeFirst();

	public E removeLast();

	public E remove(int index);

	public void clear();

	public boolean contains(E e);

	public int indexOf(E e);

	public int lastIndexOf(E e);

	public void replace(int index, E e);

}
