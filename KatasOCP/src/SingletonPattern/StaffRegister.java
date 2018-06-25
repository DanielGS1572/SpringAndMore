package SingletonPattern;

public class StaffRegister {
		private static final StaffRegister instance;
		
		static{
			instance = new StaffRegister();
		}
		private StaffRegister(){
			
		}
		public static StaffRegister getInstance(){
			return instance;
		}
}
