package EqualsTest;

public class Objeto {
	private int id;
	
	public Objeto(int id){
		this.id = id;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Objeto)) return false;
		return this.id == ((Objeto)obj).getId();
	}
	
	public int getId(){
		return id;
	}
	
}
