package ar.gabrieldevoto.tp0.Abstract;
public interface Queue {
	boolean isEmpty();
	int size();
	void add(Object item); // agregar un item
	Object top(); // retornar el primer item, lanzar exception si esta vacío.
	void remove(); // remover el primer item, lanzar exception si esta vacío
}
