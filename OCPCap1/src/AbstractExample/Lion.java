package AbstractExample;

public class Lion extends Cat {

	@Override
	void clean() {
		System.out.println("clean()");
	}
	@Override
	void clean2() {
		System.out.println("clean2() overriden");
	}

}
