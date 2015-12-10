import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HelloWorld {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		name = br.readLine();
		
		System.out.println("Hello "+name);
		System.out.println("Welcome to Git");
		
		

	}

}
