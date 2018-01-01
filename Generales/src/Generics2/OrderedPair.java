package Generics2;

public class OrderedPair<K,V> implements Pair<K,V> {
	//Cuando se implement la interfaz a la clase tambien se le debe pasar los types
	
	private K key;
	private V value;
	
	public OrderedPair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
