package ar.gabrieldevoto.tp0.Concrete;

public class FirstNode implements Node {

	public Node next;
	
	public FirstNode(){
		this.next = new LastNode();
	}
	
	@Override
	public int length() {
		return this.next.length();
	}

	@Override
	public void add(Node previous, Node newOne) {
		this.next().add(this, newOne);
	}

	@Override
	public Object content() {
		throw new AssertionError("La coleccion esta vacia.");
	}

	@Override
	public void next(Node next) {
		this.next = next;
	}

	@Override
	public Node next() {
		return this.next;
	}

}
