package chap15.book.example.s150202;

import java.util.List;
import java.util.Vector;

import chap15.book.exercise.p07.Board;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
	}
}
