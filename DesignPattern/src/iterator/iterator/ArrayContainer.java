package iterator.iterator;

import java.util.Arrays;
import java.util.Iterator;

/** 推荐看一下java里Collection Framework下的分钟Iterator的实现 */
public class ArrayContainer<E> {

	private Object[] contents;
	
	private int size;
	
	public ArrayContainer(int initialCapacity) {
		super();
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: "
					+ initialCapacity);
		this.contents = new Object[initialCapacity];
	}

	/**
	 * Constructs an empty list with an initial capacity of ten.
	 */
	public ArrayContainer() {
		this(10);
	}

	public boolean add(E e) {
		ensureCapacity(size + 1); // Increments modCount!!
		contents[size++] = e;
		return true;
	}

	/**参照ArrayList的写法*/
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = contents.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			// minCapacity is usually close to size, so this is a win:
			contents = Arrays.copyOf(contents, newCapacity);
		}
	}

	private final class ArrayIterator implements Iterator<E> {

		int position = 0;
		
		@Override
		public boolean hasNext() {
			if (position >= contents.length || contents[position] == null) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public E next() {
			E element = (E) contents[position];
			position = position + 1;
			return element;
		}

		@Override
		public void remove() {
			if (position <= 0) {
				throw new IllegalStateException(
						"You can't remove an item until you've done at least one next()");
			}
			if (contents[position - 1] != null) {
				for (int i = position - 1; i < (contents.length - 1); i++) {
					contents[i] = contents[i + 1];
				}
				contents[contents.length - 1] = null;
			}
		}

	}

	public Iterator<E> createIterator() {
		return new ArrayIterator();
	}
}
