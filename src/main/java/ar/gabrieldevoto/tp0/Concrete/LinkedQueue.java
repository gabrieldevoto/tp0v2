package ar.gabrieldevoto.tp0.Concrete;

import ar.gabrieldevoto.tp0.Abstract.Queue;

public class LinkedQueue implements Queue {
	
	private Node first;
	
	public LinkedQueue(){
		this.first = new FirstNode();
	}
	
	@Override
	public boolean isEmpty() {
		return this.first.length() == 0;
	}

	@Override
	public int size() {
		return this.first.length();
	}

	@Override
	public void add(Object item) {
		this.first.add(this.first, new MiddleNode(item));
	}

	@Override
	public Object top() {
		return this.first.next().content();
	}

	@Override
	public void remove() {
		this.first.next(this.first.next().next());
	}

}
