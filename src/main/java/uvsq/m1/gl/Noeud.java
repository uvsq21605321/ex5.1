package uvsq.m1.gl;

public class Noeud<T> {

	private Noeud<T> precedent = null; 
	private Noeud<T> suivant = null; 
	private T element;              
	
	
	
	public Noeud(T element){
		
		this.element = element;
		
	}
	
	public void addElement(T suivant) {
		
		if (this.suivant == null) {
			this.suivant = new Noeud<T>(suivant);
			this.suivant.precedent = this;
		}
		else 
			this.suivant.addElement(suivant);
		
		
	}
	

	public T getElement() {
		
		return this.element;
	}

	public void remove() {
		
		this.precedent.suivant = this.suivant;
		this.suivant.precedent = this.precedent;
		this.element = null;
		this.suivant = null;
		this.precedent = null;
	}

	public boolean hasNext() {
		
		if (this.suivant != null) return true;
		else return false;
	}
	
	
	public Noeud<T> getNext() {
		
		return this.suivant;
	}
	
	public Noeud<T> getPrevious() {
		
		return this.precedent;
	}

	
}
