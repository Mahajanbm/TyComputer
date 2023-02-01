package demo.example.demo;

public class Demo implements I1,I2 {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.display();
		d1.getData();
	}
	public void display() {
		System.out.println("Display method");
		
	}
	public void getData() {
		System.out.println("Get Data MEthod");
		
	}

}
