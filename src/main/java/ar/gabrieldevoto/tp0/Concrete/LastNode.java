package ar.gabrieldevoto.tp0.Concrete;

public class LastNode implements Node {

	@Override
	public int length() {
		return 0;
	}

	@Override
	public void add(Node previous, Node newOne) {
		previous.next(newOne);
	}

	@Override
	public void next(Node next) {
		throw new AssertionError("Este es el ultimo nodo, no tiene siguiente.");
	}

	@Override
	public Object content() {
		throw new AssertionError("La coleccion esta vacia.");
	}

	@Override
	public Node next() {
		throw new AssertionError("La coleccion esta vacia.");
	}
}
