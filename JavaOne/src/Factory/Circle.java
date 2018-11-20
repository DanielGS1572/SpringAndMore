package Factory;
import java.awt.Color;
public class Circle{
	private Color color;
	
	public Circle(){
		this.color = Color.gray;
	}

	public Circle(Color color) {
		this.color = color;
	}
	public Color getColor(){
		return this.color;
	}
}
