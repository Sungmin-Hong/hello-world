// HelloWorld class
public class HelloWorld {
	public static void main(String [] args) {
		String name = "Someone";
		if (args.length != 0) {
			name = args[0];
		}
		System.out.println("Hello, " + name);
	}
}
