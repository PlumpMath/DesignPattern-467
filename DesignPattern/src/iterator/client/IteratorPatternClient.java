package iterator.client;

import java.util.Iterator;

import iterator.iterator.ArrayContainer;

public class IteratorPatternClient {

	/**
	 * The sample is easy.
	 * You can @see java.util.AbstractList as a reference of standard implemetation of iterator.
	 */
	public static void main(String[] args) {
		ArrayContainer<String> arrays = new ArrayContainer<String>();
		arrays.add("This is the first element!");
		arrays.add("This is the second element!");
		arrays.add("This is the third element!");
		Iterator<String> arrayIt =  arrays.createIterator();
		//±éÀú
		while(arrayIt.hasNext()){
			String element = arrayIt.next();
			System.out.println(element);
		}
		Iterator<String> deleteIt =  arrays.createIterator();
		while(deleteIt.hasNext()){
			String element = deleteIt.next();
			System.out.println(element);
			deleteIt.remove();
			System.out.println(element+" has been removed!");
		}
	}

}
