package InterfaceBasics1;

public class Eagle implements Fly{

	@Override
	public int getWingType() throws Exception {
		// TODO Auto-generated method stub
		return 12;
	}
	
	public void getLandingType(){
		System.out.println("eagle landing");
	}

}
