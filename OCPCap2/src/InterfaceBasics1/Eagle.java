package InterfaceBasics1;

public class Eagle implements Fly {
	public int getWingSpan() throws Exception{	/*No es necesario que lleve el throws de la interfaz, puede no llevar nada*/
		return 15;
	}
	
	public void land(){
		System.out.println("Eagle is diving fast");
	}
	
	//Estos dos no se pueden llamar aqui, seria en una
	//clase que no la implemente, ver app2
//	Fly.MAX_SPEED
//	Fly.calculateSpeed
}
