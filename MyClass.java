public class MyClass {
	static int count = 0;
	static final double pi = 3.14;


MyClass() {
	count++;
}

public static void main(String[] args) {
	MyClass obj1 = new MyClass();
	MyClass obj2 = new MyClass();
	MyClass obj3 = new MyClass();

	System.out.println("Count: " +count);
	System.out.println("Pi: " +pi);
}

}
