package chap13.book.example.s130400;

import chap13.book.example.s130200.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
                                   