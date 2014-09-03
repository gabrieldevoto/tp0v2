package ar.gabrieldevoto.tp0.Concrete;

public interface Node {
	
	public abstract int length();
	public abstract void add(Node previous,Node newOne);
	public abstract Object content();
	public abstract void next(Node next);
	public abstract Node next();
}
