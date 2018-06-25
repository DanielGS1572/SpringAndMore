package ImmutableObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class Animal {
		private int age;
		private List<String> name;
		
		private Animal(){
			
		}
		public Animal(int age, List<String> name){
			this.age = age;
			this.name = new ArrayList<String>(name);
		}
		@Override
		public String toString() {
			return "Animal [age=" + age + ", name=" + name + "]";
		}
		
		
		
}
