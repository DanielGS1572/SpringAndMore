package EqualsTest;

public class Objeto {
	private int id;
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Objeto)) return false;
		if(this.id == ((Objeto)obj).id) return true; else return false;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
