package demo.example.demo;

public class Client implements P1,P2 {
	public void demo()
	{
		System.out.println("Demo method implementataion");
	}
	public static void main(String[] args) {

		P1 p1=new Client();
		p1.demo();
		P2 p2=new Client();
		p2.demo();
	}

}
