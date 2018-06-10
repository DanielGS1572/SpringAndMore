package EqualsTest;

public class Objeto {
	protected int id;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Objeto))	return false;
		if((((Objeto)obj).getId()) == this.id ) return true;else return false;
	}
}
