package test;

public class Test1 {

	//メインメソッド
	public static void main(String[] args) {
		sayHello("太郎",30);
	}

	//sayHelloメソッド
	public static void sayHello(String name, int age) {
		System.out.println("Hello" + name + "さん。年齢は" + age);
	}
}
