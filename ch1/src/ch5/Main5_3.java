package ch5;
//mainメソッド以外からメソッドの呼び出し
public class Main5_3 {

	public static void matodA() {
		System.out.println("methodA");
	methodB();	
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
	matodA();
	}
}
