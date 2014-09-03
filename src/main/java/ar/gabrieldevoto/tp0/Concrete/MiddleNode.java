package ar.gabrieldevoto.tp0.Concrete;

public class MiddleNode implements Node {

	public Node next = new LastNode();
	public Object item;
	
	public MiddleNode(Object item){
		this.item = item;
	}
	
	@Override
	public int length() {
		return this.next.length() + 1;
	}
	
	@Override
	public void add(Node previous,Node newOne) {
		this.next.add(this,newOne);
	}
	
	@Override
	public void next(Node next){
		this.next = next;
	}
	
	@Override
	public Object content() {
		return this.item;
	}

	@Override
	public Node next() {
		return this.next;
	}
	
}
