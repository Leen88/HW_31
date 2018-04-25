package polymorphism;

public class App extends Parent {
	
	public void move() {System.out.println("Child Class");}
	public void a() {this.move();}
	public void b() {super.move();}
	public static void add(int a, int b) {System.out.println(a + b + " ::2 params");}
	public static void add(int a, int b, int c) {System.out.println(a + b + c +" ::3 params");}
	public static void add(int a, int b, int c, int d) {System.out.println(a + b + c + d +" ::4 params");}
	
	public static void main(String[] args) {
		// Overriding
		new App() .a();
		new App() .b();
		// Overloading
		add(2, 7);
		add(2, 7, 6);
		add(2, 7, 6, 5);	
	}
}
