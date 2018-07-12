package LambdaExpressions;

import java.io.File;
import java.io.FilenameFilter;

public class LE2FilenameFilter {

	public static void main(String[] args) {
		File directory = new File("./src/main/java");
		
		String[] names = directory.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		
		String[] names2 = directory.list((dir,name) -> name.endsWith(".java"));					/*Ver como no se le pasa el tipo de dato en los argumentos*/
		String[] names3 = directory.list((File dir, String name) -> name.endsWith(".java"));		
	}

}
