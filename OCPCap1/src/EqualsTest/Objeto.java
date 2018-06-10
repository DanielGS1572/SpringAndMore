package EqualsTest;

public class Objeto {
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Objeto)) return false;
		if(((Objeto)obj).getId() == id) return true;   /*Si en lugar de id se usa String, debería de ser equals*/
		else
			return false;
	}
}
