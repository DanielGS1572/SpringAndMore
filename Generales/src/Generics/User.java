package Generics;

public class User {
	Glass<Water> glassOfWater = new Glass<>();
	Glass<Juice> glassOfJuice = new Glass<>();
	
	
	//Los genericos se usan para no tener que usar el casteo
	//si en la clase glass se hubiera puesto Object en 
	//Water w = (Water)glassOfWater.typeOfLiquid; se tendría que hacer un casteo
	Water w = glassOfWater.typeOfLiquid;
	Juice j = glassOfJuice.typeOfLiquid;
}
